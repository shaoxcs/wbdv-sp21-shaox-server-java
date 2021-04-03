package com.wbdvsp21shaox.serverjava.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;


@Data
@Entity
@Table(name="widgets")
public class Widget {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;
  private String topicId;
  private String type;
  private Integer size;
  private String text;
  private String name;
  private Integer widgetOrder;
  private String src;
  private String url;
  private String href;
  private Integer width;
  private Integer height;
  private String cssClass;
  private String style;
  private String value;
}