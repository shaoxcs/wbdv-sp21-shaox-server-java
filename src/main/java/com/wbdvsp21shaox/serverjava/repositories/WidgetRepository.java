package com.wbdvsp21shaox.serverjava.repositories;

import com.wbdvsp21shaox.serverjava.models.Widget;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface WidgetRepository extends CrudRepository<Widget, Integer> {

  @Query(value = "SELECT * FROM wbdv_sp21_02_schema.widgets WHERE topic_id=:tid",nativeQuery = true)
  List<Widget> findWidgetsForTopic(@Param("tid") String topicId);

  @Query(value = "SELECT * FROM widgets WHERE id=:wid", nativeQuery = true)
  Widget findWidgetById(@Param("wid") Integer widgetId);
}
