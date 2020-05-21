package com.netflix.spinnaker.front50.model.notification;

import java.util.Arrays;
import java.util.Collection;

public interface NotificationDAO {

  Collection<String> NOTIFICATION_FORMATS =
      Arrays.asList("bearychat", "email", "googlechat", "hipchat", "pubsub", "slack", "sms");

  Collection<Notification> all();

  Notification getGlobal();

  Notification get(HierarchicalLevel level, String name);

  void saveGlobal(Notification notification);

  void save(HierarchicalLevel level, String name, Notification notification);

  void delete(HierarchicalLevel level, String name);
}
