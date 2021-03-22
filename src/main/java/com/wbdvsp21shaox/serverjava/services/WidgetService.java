package com.wbdvsp21shaox.serverjava.services;


import com.wbdvsp21shaox.serverjava.models.Widget;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class WidgetService {
  private List<Widget> widgets = new ArrayList<>();

  public List<Widget> findAllWidgets() {
    return widgets;
  }

  public List<Widget> findWidgetsForTopic(String topicId) {
    List<Widget> ws = new ArrayList<>();
    for (Widget w : widgets) {
      if (w.getTopicId().equals(topicId)) {
        ws.add(w);
      }
    }
    return ws;
  }

  public Widget createWidgetForTopic(String topicId, Widget widget) {
    widget.setTopicId(topicId);
    widget.setId((new Date()).getTime());
    widgets.add(widget);
    return widget;
  }

  public Integer deleteWidget(Long id) {
    int index = -1;
    for (int i = 0; i < widgets.size(); i++) {
      if (widgets.get(i).getId().equals(id)) {
        index = i;
        widgets.remove(index);
        return 1;
      }
    }
    return -1;
  }

  public Integer updateWidget(Long id, Widget widget) {
    for (int i = 0; i < widgets.size(); i++) {
      if (widgets.get(i).getId().equals(id)) {
        widgets.set(i, widget);
        return 1;
      }
    }
    return -1;
  }

}
