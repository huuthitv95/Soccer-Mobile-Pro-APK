package com.facebook.ads.redexgen.core;

import com.google.common.base.Ascii;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Vh */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class RunnableC6225Vh implements Runnable {
    public static byte[] A03;
    public final /* synthetic */ C6067T8 A00;
    public final /* synthetic */ C6228Vk A01;
    public final /* synthetic */ String A02;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 28);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{-66, -58, -72, -6, -5, 5, 6, 1, 4, Ascii.f22503VT, 3, -10, 1, 0, 3, 5, -6, -1, -8, -38, -51, -39, -35, -51, -37, -36, -57, -47, -52};
    }

    public RunnableC6225Vh(C6228Vk c6228Vk, String str, C6067T8 c6067t8) {
        this.A01 = c6228Vk;
        this.A02 = str;
        this.A00 = c6067t8;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        ArrayList<C6227Vj> arrayList;
        if (AbstractC6271WU.A02(this)) {
            return;
        }
        try {
            C6099Te nvl = new C6099Te(A00(0, 3, 84));
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            jSONObject.put(A00(3, 7, Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE), jSONArray);
            jSONObject.put(A00(19, 10, 76), this.A02);
            synchronized (this.A01.A0D) {
                arrayList = new ArrayList(this.A01.A0D);
                this.A01.A0D.clear();
            }
            for (C6227Vj c6227Vj : arrayList) {
                jSONArray.put(A00(0, 0, 23) + c6227Vj.A00 + ';' + c6227Vj.A02 + ';' + c6227Vj.A01);
            }
            nvl.A07(jSONObject);
            nvl.A05(1);
            this.A00.A08().ABD(A00(10, 9, Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE), AbstractC6098Td.A2R, nvl);
        } catch (JSONException unused) {
        } catch (Throwable th) {
            AbstractC6271WU.A00(th, this);
        }
    }
}
