package com.anmi.controllers;

import com.anmi.models.User;
import com.anmi.repository.UserRepository;
import com.anmi.services.Counter;
import org.springframework.stereotype.Component;
import play.mvc.Controller;
import play.mvc.Result;

import javax.inject.Inject;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;

@Component
public class UserController extends Controller {
    @Inject
    private UserRepository userRepository;

    @Inject
    private Counter counter;

    public CompletionStage<Result> getAllUsers() {
        CompletionStage<Iterable<User>> promiseOfUsers = CompletableFuture.completedFuture(userRepository.findAll());
        CompletionStage<Result> promiseOfResult = promiseOfUsers.thenApply(users ->
                ok("User name: " + users.toString())
        );
        return promiseOfResult;
    }


}
