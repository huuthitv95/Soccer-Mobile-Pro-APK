package com.tiktok.util;

import android.text.TextUtils;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class JSON {
    private static final String TAG = "JSON";

    public static JSONObject build() {
        return new JSONObject();
    }

    public static JSONObject build(String json) {
        try {
            return new JSONObject(json);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static JSONObject build(Map<String, String> map) {
        try {
            return new JSONObject(map);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static JSONArray buildArr() {
        return new JSONArray();
    }

    public static JSONArray buildArr(String json) {
        try {
            return new JSONArray(json);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static boolean getBoolean(JSONObject json, String key) {
        return getBoolean(json, key, false);
    }

    public static boolean getBoolean(JSONObject json, String key, boolean fallback) {
        if (json != null) {
            try {
                if (!TextUtils.isEmpty(key)) {
                    return json.optBoolean(key, fallback);
                }
            } catch (Throwable unused) {
            }
        }
        return fallback;
    }

    public static double getDouble(JSONObject json, String key) {
        return getDouble(json, key, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
    }

    public static double getDouble(JSONObject json, String key, double fallback) {
        if (json != null) {
            try {
                if (!TextUtils.isEmpty(key)) {
                    return json.optDouble(key, fallback);
                }
            } catch (Throwable unused) {
            }
        }
        return fallback;
    }

    public static int getInt(JSONObject json, String key) {
        return getInt(json, key, 0);
    }

    public static int getInt(JSONObject json, String key, int fallback) {
        if (json != null) {
            try {
                if (!TextUtils.isEmpty(key)) {
                    return json.optInt(key, fallback);
                }
            } catch (Throwable unused) {
            }
        }
        return fallback;
    }

    public static JSONObject getJSONObject(JSONArray jsonArray, int index) {
        try {
            return jsonArray.getJSONObject(index);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static JSONArray getJsonArray(JSONObject json, String key) {
        if (json == null) {
            return null;
        }
        try {
            if (TextUtils.isEmpty(key)) {
                return null;
            }
            return json.optJSONArray(key);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static JSONObject getJsonObject(JSONObject json, String key) {
        if (json == null) {
            return null;
        }
        try {
            if (TextUtils.isEmpty(key)) {
                return null;
            }
            return json.optJSONObject(key);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Iterator<String> getKeys(JSONObject json) {
        if (json == null) {
            return null;
        }
        try {
            return json.keys();
        } catch (Throwable unused) {
            return null;
        }
    }

    public static long getLong(JSONObject json, String key) {
        return getLong(json, key, 0L);
    }

    public static long getLong(JSONObject json, String key, long fallback) {
        if (json != null) {
            try {
                if (!TextUtils.isEmpty(key)) {
                    return json.optLong(key, fallback);
                }
            } catch (Throwable unused) {
            }
        }
        return fallback;
    }

    public static Object getObject(JSONObject json, String key) {
        return getObject(json, key, null);
    }

    public static Object getObject(JSONObject json, String key, Object fallback) {
        if (json != null) {
            try {
                if (!TextUtils.isEmpty(key)) {
                    return json.opt(key);
                }
            } catch (Throwable unused) {
            }
        }
        return fallback;
    }

    public static String getString(JSONObject json, String key) {
        return getString(json, key, "");
    }

    public static String getString(JSONObject json, String key, String fallback) {
        if (json != null) {
            try {
                if (!TextUtils.isEmpty(key)) {
                    return json.optString(key, fallback);
                }
            } catch (Throwable unused) {
            }
        }
        return fallback;
    }

    public static void putArr(JSONArray arr, Object object) {
        if (arr == null || object == null) {
            return;
        }
        try {
            arr.put(object);
        } catch (Throwable unused) {
        }
    }

    public static void putBoolean(JSONObject json, String key, boolean data) {
        if (json != null) {
            try {
                if (TextUtils.isEmpty(key)) {
                    return;
                }
                json.put(key, data);
            } catch (Throwable unused) {
            }
        }
    }

    public static void putDouble(JSONObject json, String key, double data) {
        if (json != null) {
            try {
                if (TextUtils.isEmpty(key)) {
                    return;
                }
                json.put(key, data);
            } catch (Throwable unused) {
            }
        }
    }

    public static void putInt(JSONObject json, String key, int data) {
        if (json != null) {
            try {
                if (TextUtils.isEmpty(key)) {
                    return;
                }
                json.put(key, data);
            } catch (Throwable unused) {
            }
        }
    }

    public static void putLong(JSONObject json, String key, long data) {
        if (json != null) {
            try {
                if (TextUtils.isEmpty(key)) {
                    return;
                }
                json.put(key, data);
            } catch (Throwable unused) {
            }
        }
    }

    public static void putObject(JSONObject json, String key, Object data) {
        if (json != null) {
            try {
                if (TextUtils.isEmpty(key)) {
                    return;
                }
                json.put(key, data);
            } catch (Throwable unused) {
            }
        }
    }

    public static JSONArray remove(JSONArray jsonArray, int index) {
        JSONArray jSONArray = new JSONArray();
        if (index < 0 || index >= jsonArray.length()) {
            return jsonArray;
        }
        for (int i = 0; i < index; i++) {
            try {
                jSONArray.put(jsonArray.getJSONObject(i));
            } catch (JSONException unused) {
            }
        }
        while (true) {
            index++;
            if (index >= jsonArray.length()) {
                return jSONArray;
            }
            try {
                jSONArray.put(jsonArray.getJSONObject(index));
            } catch (Throwable unused2) {
            }
        }
    }
}
