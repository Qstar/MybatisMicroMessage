package dao;

import bean.Message;

import java.util.List;
import java.util.Map;

/**
 * 与Message配置文件相对应的接口
 */
public interface IMessage {
    /**
     * 根据查询条件查询消息列表
     */
    List<Message> queryMessageList(Map<String, Object> parameter);

    /**
     * 根据查询条件查询消息列表的条数
     */
    int count(Message message);

    /**
     * 根据查询条件分页查询消息列表
     */
    List<Message> queryMessageListByPage(Map<String, Object> parameter);
}
