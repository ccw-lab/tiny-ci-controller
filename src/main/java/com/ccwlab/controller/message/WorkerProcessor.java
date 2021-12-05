package com.ccwlab.controller.message;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

public interface WorkerProcessor {
    String channel = "docker-worker";
    @Input(WorkerProcessor.channel)
    SubscribableChannel input();

    @Output(WorkerProcessor.channel)
    MessageChannel output();
}
