package app.coolweather.com.myweathecool.util;

/**
 * Created by Administrator on 2016/3/21 0021.
 */
public interface HttpCallbackListener {
    void onFinish(String response);
    void onError(Exception e);
}
