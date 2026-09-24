package com.tiktok.appevents;

import android.content.Context;
import com.tiktok.util.JSON;
import com.tiktok.util.TTUtil;
import java.io.Serializable;
import java.security.MessageDigest;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class TTUserInfo implements Cloneable, Serializable {
    static final String TAG = "TTUserInfo";
    public static final TTUserInfo sharedInstance = new TTUserInfo();
    String anonymousId;
    String email;
    String externalId;
    String externalUserName;
    transient boolean isIdentified = false;
    String phoneNumber;

    public static void reset(Context context, boolean forceGenerateAnoId) {
        TTUserInfo tTUserInfo = sharedInstance;
        tTUserInfo.anonymousId = TTUtil.getOrGenAnoId(context, forceGenerateAnoId);
        tTUserInfo.externalId = null;
        tTUserInfo.externalUserName = null;
        tTUserInfo.phoneNumber = null;
        tTUserInfo.email = null;
        tTUserInfo.isIdentified = false;
    }

    public static String toSha256(String str) {
        if (str == null) {
            return null;
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(str.getBytes());
            StringBuilder sb = new StringBuilder();
            for (byte b : messageDigest.digest()) {
                sb.append(Integer.toString((b & 255) + 256, 16).substring(1));
            }
            return sb.toString();
        } catch (Throwable th) {
            TTCrashHandler.handleCrash(TAG, th, 2);
            return null;
        }
    }

    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public TTUserInfo m44668clone() {
        try {
            return (TTUserInfo) super.clone();
        } catch (Throwable unused) {
            return new TTUserInfo();
        }
    }

    public boolean isIdentified() {
        return this.isIdentified;
    }

    public void setEmail(String email) {
        this.email = toSha256(email);
    }

    public void setExternalId(String externalId) {
        this.externalId = toSha256(externalId);
    }

    public void setExternalUserName(String externalUserName) {
        this.externalUserName = toSha256(externalUserName);
    }

    public void setIdentified() {
        this.isIdentified = true;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = toSha256(phoneNumber);
    }

    public JSONObject toJsonObject() {
        JSONObject jSONObjectBuild = JSON.build();
        try {
            String str = this.externalId;
            if (str != null) {
                JSON.putObject(jSONObjectBuild, "external_id", str);
            }
            String str2 = this.externalUserName;
            if (str2 != null) {
                JSON.putObject(jSONObjectBuild, "external_username", str2);
            }
            String str3 = this.phoneNumber;
            if (str3 != null) {
                JSON.putObject(jSONObjectBuild, "phone_number", str3);
            }
            String str4 = this.email;
            if (str4 != null) {
                JSON.putObject(jSONObjectBuild, "email", str4);
                return jSONObjectBuild;
            }
        } catch (Throwable th) {
            TTCrashHandler.handleCrash(TAG, th, 2);
        }
        return jSONObjectBuild;
    }
}
