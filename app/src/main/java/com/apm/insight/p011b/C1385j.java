package com.apm.insight.p011b;

import android.os.Looper;
import android.os.Message;
import android.os.MessageQueue;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.apm.insight.C1386c;
import com.apm.insight.runtime.C1468j;
import java.lang.reflect.Field;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.apm.insight.b.j */
/* JADX INFO: compiled from: LooperUtil.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C1385j {

    /* JADX INFO: renamed from: a */
    private static MessageQueue f490a;

    /* JADX INFO: renamed from: b */
    private static Field f491b;

    /* JADX INFO: renamed from: c */
    private static Field f492c;

    /* JADX INFO: renamed from: a */
    private static Message m985a(Message message) {
        Field field = f492c;
        if (field != null) {
            try {
                return (Message) field.get(message);
            } catch (Exception unused) {
                return null;
            }
        }
        try {
            Field declaredField = Class.forName("android.os.Message").getDeclaredField("next");
            f492c = declaredField;
            declaredField.setAccessible(true);
            return (Message) f492c.get(message);
        } catch (Exception unused2) {
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static Message m986a(MessageQueue messageQueue) {
        Field field = f491b;
        if (field != null) {
            try {
                return (Message) field.get(messageQueue);
            } catch (Exception unused) {
                return null;
            }
        }
        try {
            Field declaredField = Class.forName("android.os.MessageQueue").getDeclaredField("mMessages");
            f491b = declaredField;
            declaredField.setAccessible(true);
            return (Message) f491b.get(messageQueue);
        } catch (Exception unused2) {
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static MessageQueue m987a() {
        if (f490a == null && Looper.getMainLooper() != null) {
            Looper mainLooper = Looper.getMainLooper();
            if (mainLooper == Looper.myLooper()) {
                f490a = Looper.myQueue();
            } else {
                f490a = mainLooper.getQueue();
            }
        }
        return f490a;
    }

    /* JADX INFO: renamed from: a */
    public static JSONArray m988a(long j) {
        MessageQueue messageQueueM987a = m987a();
        JSONArray jSONArray = new JSONArray();
        if (messageQueueM987a != null) {
            try {
                synchronized (messageQueueM987a) {
                    Message messageM986a = m986a(messageQueueM987a);
                    if (messageM986a == null) {
                        return jSONArray;
                    }
                    int i = 0;
                    int i2 = 0;
                    while (messageM986a != null && i < 100) {
                        i++;
                        i2++;
                        JSONObject jSONObjectM989a = m989a(messageM986a, j);
                        try {
                            jSONObjectM989a.put("id", i2);
                        } catch (JSONException unused) {
                        }
                        jSONArray.put(jSONObjectM989a);
                        messageM986a = m985a(messageM986a);
                    }
                }
            } catch (Throwable th) {
                C1386c.m990a();
                C1468j.m1652a(th, "NPTH_CATCH");
                return jSONArray;
            }
        }
        return jSONArray;
    }

    /* JADX INFO: renamed from: a */
    private static JSONObject m989a(Message message, long j) {
        JSONObject jSONObject = new JSONObject();
        if (message != null) {
            try {
                jSONObject.put("when", message.getWhen() - j);
                if (message.getCallback() != null) {
                    jSONObject.put("callback", String.valueOf(message.getCallback()));
                }
                jSONObject.put("what", message.what);
                if (message.getTarget() != null) {
                    jSONObject.put(TypedValues.AttributesType.S_TARGET, String.valueOf(message.getTarget()));
                } else {
                    jSONObject.put("barrier", message.arg1);
                }
                jSONObject.put("arg1", message.arg1);
                jSONObject.put("arg2", message.arg2);
                if (message.obj != null) {
                    jSONObject.put("obj", message.obj);
                    return jSONObject;
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return jSONObject;
    }
}
