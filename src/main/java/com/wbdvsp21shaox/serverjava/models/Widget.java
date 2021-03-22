package com.wbdvsp21shaox.serverjava.models;

import lombok.Data;

@Data
public class Widget {
  private Long id;
  private String topicId;
  private String type;
  private Integer size;
  private String text;
}