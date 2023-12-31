package org.example.controller.requests;

import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UpdateSubtaskRequest extends UpdateTaskRequest{
    @NotNull
    private Integer epicId;

    @Override
    public String toString() {
        return "UpdateSubtaskRequest{" +
                "name='" + getName() + '\'' +
                ", description='" + getDescription() + '\'' +
                ", status=" + getStatus() +
                ", id=" + getId() +
                '}';
    }
}
