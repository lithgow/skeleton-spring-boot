package com.example.skeleton.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Value;

@Data
@AllArgsConstructor
public class SkeletonMessage {
    @JsonProperty("message")
    private final String message;
}
