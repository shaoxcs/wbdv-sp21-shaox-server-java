package com.wbdvsp21shaox.serverjava.services;

import com.wbdvsp21shaox.serverjava.models.Widget;
import com.wbdvsp21shaox.serverjava.repositories.WidgetRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WidgetService {

  @Autowired
  WidgetRepository repository;

  public List<Widget> findAllWidgets() {
    return (List<Widget>) repository.findAll();
  }

  public List<Widget> findWidgetsForTopic(String topicId) {
    return repository.findWidgetsForTopic(topicId);
  }

  public Widget createWidgetForTopic(String topicId, Widget widget) {
    widget.setTopicId(topicId);
    return repository.save(widget);
  }

  public Integer deleteWidget(Integer id) {
    repository.deleteById(id);
    return 1;
  }

  public Integer updateWidget(Integer id, Widget widget) {
    widget.setId(id);
    repository.save(widget);
    return 1;
  }

  public Widget findWidgetById(Integer wid) {
    return repository.findWidgetById(wid);
  }
}
