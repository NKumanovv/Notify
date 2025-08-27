package com.notify.note.service;

import com.notify.note.model.Note;
import com.notify.user.model.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Slf4j
@Service
public class NoteService {

    public Note initializeNote(User user){

        return Note.builder()
                .title("Title here")
                .content("Write your content here...")
                .user(user)
                .createdOn(LocalDateTime.now())
                .build();
    }


}
