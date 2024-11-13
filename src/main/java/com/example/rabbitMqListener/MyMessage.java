package com.example.rabbitMqListener;


import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class MyMessage {
    private String content;
    private Load load;
    private int priority;

    // Getters and setters
    public String getContent() {
        return content;
    }


    public Load getLoad(){
        return load;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setLoad(Load load){
        this.load=load;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    @Override
    public String toString() {
        return "MyMessage{" +
                "content='" + content + '\'' +
                "load='"+load.toString()+'\''+
                ", priority=" + priority +
                '}';
    }
}
