package todolist.service;

import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import todolist.dto.TaskDto;
import todolist.dto.UserReqDto;
import todolist.dto.UserResDto;
import todolist.entity.Task;
import todolist.entity.User;
import todolist.repository.UserRepository;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;
    private final ModelMapper modelMapper;

    @Transactional(readOnly = true)
    public List<UserResDto> getUsers() {
        List<User> users = userRepository.findAll();
        return users
                .stream()
                .map(user -> modelMapper.map(user, UserResDto.class))
                .collect(Collectors.toList());
    }

    @Transactional(readOnly = true)
    public UserResDto getUser(Integer userId) {
        User user = userRepository.findById(userId)
                .orElseThrow(() -> new RuntimeException(String.format("User not found: #%s", userId)));
        return modelMapper.map(user, UserResDto.class);
    }

    @Transactional(readOnly = true)
    public List<TaskDto> getTasksOfUser(Integer userId) {
        User user = userRepository.findById(userId)
                .orElseThrow(() -> new RuntimeException(String.format("User not found: #%s", userId)));
        List<Task> tasks = user.getTasks();
        return tasks
                .stream()
                .map(task -> modelMapper.map(task, TaskDto.class))
                .collect(Collectors.toList());
    }

    @Transactional
    public UserResDto saveUser(UserReqDto userReqDto) {
        User user;
        if (Objects.isNull(userReqDto.getId())) {
            user = new User();
        } else {
            user = userRepository.findById(userReqDto.getId())
                    .orElseThrow(() -> new RuntimeException(String.format("User not found: #%s", userReqDto.getId())));
        }
        modelMapper.map(userReqDto, user);
        User savedUser = userRepository.save(user);
        return modelMapper.map(savedUser, UserResDto.class);
    }

    @Transactional
    public void deleteUser(Integer userId) {
        User user = userRepository.findById(userId)
                .orElseThrow(() -> new RuntimeException(String.format("User not found: #%s", userId)));
        userRepository.delete(user);
    }

}
