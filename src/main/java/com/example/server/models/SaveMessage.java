package com.example.server.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document("SaveMessage")
public class SaveMessage {

    @Id
    public String msdId;
    public String msgContent;
//    public String userType;
}
