package com.digitalturbine.ignite.encryption.storage;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import com.digitalturbine.ignite.authenticator.events.C4252b;
import com.digitalturbine.ignite.authenticator.events.EnumC4253c;
import com.digitalturbine.ignite.authenticator.events.EnumC4254d;
import com.digitalturbine.ignite.authenticator.utils.events.AbstractC4266a;
import com.digitalturbine.ignite.encryption.C4269c;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.NoSuchPaddingException;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: renamed from: com.digitalturbine.ignite.encryption.storage.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C4272a {

    /* JADX INFO: renamed from: a */
    public final SharedPreferences f17357a;

    /* JADX INFO: renamed from: b */
    public final C4269c f17358b = new C4269c();

    public C4272a(Context context) {
        this.f17357a = context.getSharedPreferences("odt_storage", 0);
    }

    /* JADX INFO: renamed from: a */
    public final String m20320a() {
        String string = this.f17357a.getString("odt", null);
        if (TextUtils.isEmpty(string)) {
            return "";
        }
        try {
            JSONArray jSONArray = new JSONArray(string);
            String string2 = jSONArray.getString(0);
            return this.f17358b.m20316a(jSONArray.getString(1), Base64.decode(string2, 0));
        } catch (IOException e) {
            e = e;
            C4252b.m20298a(EnumC4254d.ENCRYPTION_EXCEPTION, AbstractC4266a.m20312a(e, EnumC4253c.FAILED_EXTRACT_ENCRYPTED_DATA));
            return "";
        } catch (InvalidAlgorithmParameterException e2) {
            e = e2;
            C4252b.m20298a(EnumC4254d.ENCRYPTION_EXCEPTION, AbstractC4266a.m20312a(e, EnumC4253c.FAILED_EXTRACT_ENCRYPTED_DATA));
            return "";
        } catch (InvalidKeyException e3) {
            e = e3;
            C4252b.m20298a(EnumC4254d.ENCRYPTION_EXCEPTION, AbstractC4266a.m20312a(e, EnumC4253c.FAILED_EXTRACT_ENCRYPTED_DATA));
            return "";
        } catch (NoSuchAlgorithmException e4) {
            e = e4;
            C4252b.m20298a(EnumC4254d.ENCRYPTION_EXCEPTION, AbstractC4266a.m20312a(e, EnumC4253c.FAILED_EXTRACT_ENCRYPTED_DATA));
            return "";
        } catch (NoSuchPaddingException e5) {
            e = e5;
            C4252b.m20298a(EnumC4254d.ENCRYPTION_EXCEPTION, AbstractC4266a.m20312a(e, EnumC4253c.FAILED_EXTRACT_ENCRYPTED_DATA));
            return "";
        } catch (JSONException e6) {
            e = e6;
            C4252b.m20298a(EnumC4254d.ENCRYPTION_EXCEPTION, AbstractC4266a.m20312a(e, EnumC4253c.FAILED_EXTRACT_ENCRYPTED_DATA));
            return "";
        } catch (Exception e7) {
            C4252b.m20298a(EnumC4254d.ENCRYPTION_EXCEPTION, AbstractC4266a.m20312a(e7, EnumC4253c.FAILED_EXTRACT_ENCRYPTED_DATA));
            return "";
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m20321a(String str) {
        try {
            Pair pairM20315a = this.f17358b.m20315a(str);
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(pairM20315a.first).put(pairM20315a.second);
            this.f17357a.edit().putString("odt", jSONArray.toString()).apply();
        } catch (IOException e) {
            e = e;
            C4252b.m20298a(EnumC4254d.ENCRYPTION_EXCEPTION, AbstractC4266a.m20312a(e, EnumC4253c.FAILED_STORE_ENCRYPTED_DATA));
        } catch (InvalidAlgorithmParameterException e2) {
            e = e2;
            C4252b.m20298a(EnumC4254d.ENCRYPTION_EXCEPTION, AbstractC4266a.m20312a(e, EnumC4253c.FAILED_STORE_ENCRYPTED_DATA));
        } catch (InvalidKeyException e3) {
            e = e3;
            C4252b.m20298a(EnumC4254d.ENCRYPTION_EXCEPTION, AbstractC4266a.m20312a(e, EnumC4253c.FAILED_STORE_ENCRYPTED_DATA));
        } catch (NoSuchAlgorithmException e4) {
            e = e4;
            C4252b.m20298a(EnumC4254d.ENCRYPTION_EXCEPTION, AbstractC4266a.m20312a(e, EnumC4253c.FAILED_STORE_ENCRYPTED_DATA));
        } catch (NoSuchPaddingException e5) {
            e = e5;
            C4252b.m20298a(EnumC4254d.ENCRYPTION_EXCEPTION, AbstractC4266a.m20312a(e, EnumC4253c.FAILED_STORE_ENCRYPTED_DATA));
        } catch (Exception e6) {
            C4252b.m20298a(EnumC4254d.ENCRYPTION_EXCEPTION, AbstractC4266a.m20312a(e6, EnumC4253c.FAILED_STORE_ENCRYPTED_DATA));
        }
    }
}
