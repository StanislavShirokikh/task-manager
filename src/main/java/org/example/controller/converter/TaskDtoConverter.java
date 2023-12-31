package org.example.controller.converter;

import org.example.controller.requests.CreateEpicRequest;
import org.example.controller.requests.CreateSubtaskRequest;
import org.example.controller.requests.CreateTaskRequest;
import org.example.controller.requests.UpdateEpicRequest;
import org.example.controller.requests.UpdateSubtaskRequest;
import org.example.controller.requests.UpdateTaskRequest;
import org.example.dto.SaveEpicDto;
import org.example.dto.SaveSubTaskDto;
import org.example.dto.SaveTaskDto;
import org.example.dto.UpdateEpicDto;
import org.example.dto.UpdateSubTaskDto;
import org.example.dto.UpdateTaskDto;

public class TaskDtoConverter {
    public static SaveTaskDto convert(CreateTaskRequest createTaskRequest) {
        SaveTaskDto saveTaskDto = new SaveTaskDto();
        saveTaskDto.setName(createTaskRequest.getName());
        saveTaskDto.setDescription(createTaskRequest.getDescription());
        return saveTaskDto;
    }

    public static SaveEpicDto convert(CreateEpicRequest createEpicRequest) {
        SaveEpicDto saveEpicDto = new SaveEpicDto();
        saveEpicDto.setName(createEpicRequest.getName());
        saveEpicDto.setDescription(createEpicRequest.getDescription());
        return saveEpicDto;
    }

    public static SaveSubTaskDto convert(CreateSubtaskRequest createSubtaskRequest) {
        SaveSubTaskDto saveSubTaskDto = new SaveSubTaskDto();
        saveSubTaskDto.setName(createSubtaskRequest.getName());
        saveSubTaskDto.setDescription(createSubtaskRequest.getDescription());
        saveSubTaskDto.setEpicId(createSubtaskRequest.getEpicId());
        return saveSubTaskDto;
    }
    public static UpdateTaskDto convert(UpdateTaskRequest updateTaskRequest) {
        UpdateTaskDto updateTaskDto = new UpdateTaskDto();
        updateTaskDto.setName(updateTaskRequest.getName());
        updateTaskDto.setDescription(updateTaskRequest.getDescription());
        updateTaskDto.setId(updateTaskRequest.getId());
        updateTaskDto.setStatus(updateTaskRequest.getStatus());
        return updateTaskDto;
    }

    public static UpdateEpicDto convert(UpdateEpicRequest updateEpicRequest) {
        UpdateEpicDto updateEpicDto = new UpdateEpicDto();
        updateEpicDto.setName(updateEpicRequest.getName());
        updateEpicDto.setDescription(updateEpicRequest.getDescription());
        updateEpicDto.setId(updateEpicRequest.getId());
        return updateEpicDto;
    }

    public static UpdateSubTaskDto convert(UpdateSubtaskRequest updateSubtaskRequest) {
        UpdateSubTaskDto updateSubTaskDto = new UpdateSubTaskDto();
        updateSubTaskDto.setName(updateSubtaskRequest.getName());
        updateSubTaskDto.setDescription(updateSubtaskRequest.getDescription());
        updateSubTaskDto.setId(updateSubtaskRequest.getId());
        updateSubTaskDto.setEpicId(updateSubtaskRequest.getEpicId());
        updateSubTaskDto.setStatus(updateSubtaskRequest.getStatus());
        return updateSubTaskDto;
    }
}
