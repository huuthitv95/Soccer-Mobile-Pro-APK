package com.facebook.gamingservices.cloudgaming;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.HandlerThread;
import com.chartboost.sdk.impl.cc$$ExternalSyntheticApiModelOutline0;
import com.facebook.FacebookRequestError;
import com.facebook.GraphRequest;
import com.facebook.GraphResponse;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.facebook.gamingservices.cloudgaming.internal.SDKLogger;
import com.tiktok.appevents.edp.TTEDPEventConstants;
import java.net.HttpURLConnection;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class DaemonReceiver {
    private static SDKLogger mLogger;
    private static ConcurrentHashMap<String, CompletableFuture<GraphResponse>> requestStore;
    private static DaemonReceiver single_instance;

    private static class DaemonBroadcastReceiver extends BroadcastReceiver {
        private DaemonBroadcastReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            CompletableFuture completableFutureM17129m;
            try {
                JSONObject jSONObject = new JSONObject(intent.getStringExtra(SDKConstants.RECEIVER_PAYLOAD));
                String string = jSONObject.getString(SDKConstants.REQUEST_ID);
                if (!DaemonReceiver.requestStore.containsKey(string) || (completableFutureM17129m = cc$$ExternalSyntheticApiModelOutline0.m17129m(DaemonReceiver.requestStore.remove(string))) == null) {
                    return;
                }
                completableFutureM17129m.complete(DaemonReceiver.processResponse(jSONObject, string));
            } catch (JSONException unused) {
            }
        }
    }

    private DaemonReceiver(Context context) {
        IntentFilter intentFilter = new IntentFilter(SDKConstants.RECEIVER_INTENT);
        HandlerThread handlerThread = new HandlerThread(SDKConstants.RECEIVER_HANDLER);
        handlerThread.start();
        context.registerReceiver(new DaemonBroadcastReceiver(), intentFilter, null, new Handler(handlerThread.getLooper()));
        requestStore = new ConcurrentHashMap<>();
        mLogger = SDKLogger.getInstance(context);
    }

    private static GraphResponse createDefaultErrorResponse(String str) {
        return createErrorResponse(new FacebookRequestError(20, "UNSUPPORTED_FORMAT", "The response format is invalid."), str);
    }

    static GraphResponse createErrorResponse(FacebookRequestError facebookRequestError, String str) {
        mLogger.logSendingErrorResponse(facebookRequestError, str);
        return new GraphResponse(new GraphRequest(), null, facebookRequestError);
    }

    private static GraphResponse createErrorResponse(JSONObject jSONObject, String str) {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("error");
        return jSONObjectOptJSONObject != null ? createErrorResponse(new FacebookRequestError(jSONObjectOptJSONObject.optInt(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE), jSONObjectOptJSONObject.optString("type"), jSONObjectOptJSONObject.optString("message")), str) : createDefaultErrorResponse(str);
    }

    private static GraphResponse createSuccessResponse(JSONObject jSONObject, String str) {
        if (jSONObject.optJSONObject("success") != null) {
            mLogger.logSendingSuccessResponse(str);
            return new GraphResponse(new GraphRequest(), (HttpURLConnection) null, "", jSONObject.optJSONObject("success"));
        }
        if (jSONObject.optJSONArray("success") == null) {
            return createDefaultErrorResponse(str);
        }
        mLogger.logSendingSuccessResponse(str);
        return new GraphResponse(new GraphRequest(), (HttpURLConnection) null, "", jSONObject.optJSONArray("success"));
    }

    static synchronized DaemonReceiver getInstance(Context context) {
        if (single_instance == null) {
            single_instance = new DaemonReceiver(context);
        }
        return single_instance;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static GraphResponse processResponse(JSONObject jSONObject, String str) {
        if (jSONObject.isNull("success")) {
            return !jSONObject.isNull("error") ? createErrorResponse(jSONObject, str) : createDefaultErrorResponse(str);
        }
        return createSuccessResponse(jSONObject, str);
    }

    synchronized ConcurrentHashMap<String, CompletableFuture<GraphResponse>> getRequestStore() {
        return requestStore;
    }
}
