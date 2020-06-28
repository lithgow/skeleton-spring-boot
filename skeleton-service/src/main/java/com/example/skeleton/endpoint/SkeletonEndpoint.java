package com.example.skeleton.endpoint;

import com.example.skeleton.domain.SkeletonMessage;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping(produces = APPLICATION_JSON_VALUE)
public class SkeletonEndpoint {

    private static final Logger LOG = LoggerFactory.getLogger(SkeletonEndpoint.class);

    @ApiOperation(value = "Gets hello world", notes = "Hello world!", response = SkeletonMessage.class)
    @GetMapping("/")
    public SkeletonMessage helloWorld() {
        return new SkeletonMessage("Hello World!");
    }
}
