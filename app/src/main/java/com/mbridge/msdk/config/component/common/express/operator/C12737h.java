package com.mbridge.msdk.config.component.common.express.operator;

import android.text.TextUtils;
import android.util.Base64;
import androidx.media3.extractor.p007ts.TsExtractor;
import androidx.recyclerview.widget.ItemTouchHelper;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.facebook.internal.FacebookRequestErrorClassification;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.mbridge.msdk.config.component.common.express.operator.parts.C12746a;
import com.mbridge.msdk.config.component.common.express.operator.parts.C12748c;
import com.mbridge.msdk.config.component.common.util.C12770c;
import com.mbridge.msdk.foundation.tools.C13219q0;
import com.mbridge.msdk.foundation.tools.C13229v0;
import com.vungle.ads.internal.protos.Sdk;
import java.lang.reflect.Array;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.mbridge.msdk.config.component.common.express.operator.h */
/* JADX INFO: compiled from: OperatorEncode.java */
/* JADX INFO: loaded from: classes5.dex */
public class C12737h {

    /* JADX INFO: renamed from: a */
    private int[] f33893a = {99, 124, Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE, Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE, 242, 107, 111, 197, 48, 1, 103, 43, 254, Sdk.SDKError.Reason.AD_RESPONSE_EMPTY_VALUE, 171, Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE, 202, 130, 201, Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE, ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION, 89, 71, 240, TTAdConstant.IMAGE_MODE_VERTICAL_IMG_173, Sdk.SDKError.Reason.PLACEMENT_SLEEP_VALUE, 162, 175, 156, 164, 114, 192, 183, 253, 147, 38, 54, 63, 247, 204, 52, 165, 229, 241, 113, Sdk.SDKError.Reason.AD_RESPONSE_INVALID_TEMPLATE_TYPE_VALUE, 49, 21, 4, 199, 35, 195, 24, 150, 5, 154, 7, 18, 128, Sdk.SDKError.Reason.PRIVACY_ICON_FALLBACK_ERROR_VALUE, 235, 39, 178, Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE, 9, Sdk.SDKError.Reason.MRAID_JS_WRITE_FAILED_VALUE, 44, 26, 27, 110, 90, 160, 82, 59, Sdk.SDKError.Reason.INVALID_GZIP_BID_PAYLOAD_VALUE, 179, 41, Sdk.SDKError.Reason.INVALID_CSB_DATA_VALUE, 47, Sdk.SDKError.Reason.OMSDK_DOWNLOAD_JS_ERROR_VALUE, 83, Sdk.SDKError.Reason.INVALID_JSON_BID_PAYLOAD_VALUE, 0, 237, 32, 252, 177, 91, 106, 203, FacebookRequestErrorClassification.EC_INVALID_TOKEN, 57, 74, 76, 88, 207, Sdk.SDKError.Reason.INVALID_BID_PAYLOAD_VALUE, 239, 170, 251, 67, 77, 51, Sdk.SDKError.Reason.OMSDK_JS_WRITE_FAILED_VALUE, 69, 249, 2, 127, 80, 60, 159, 168, 81, 163, 64, 143, 146, 157, 56, 245, 188, 182, Sdk.SDKError.Reason.MRAID_JS_DOES_NOT_EXIST_VALUE, 33, 16, 255, 243, Sdk.SDKError.Reason.AD_NOT_LOADED_VALUE, 205, 12, 19, 236, 95, 151, 68, 23, 196, 167, 126, 61, 100, 93, 25, 115, 96, 129, 79, Sdk.SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE, 34, 42, 144, 136, 70, 238, 184, 20, Sdk.SDKError.Reason.INVALID_WATERFALL_PLACEMENT_ID_VALUE, 94, 11, Sdk.SDKError.Reason.MRAID_JS_COPY_FAILED_VALUE, 224, 50, 58, 10, 73, 6, 36, 92, 194, 211, 172, 98, 145, 149, 228, Sdk.SDKError.Reason.TPAT_ERROR_VALUE, 231, 200, 55, 109, ModuleDescriptor.MODULE_VERSION, Sdk.SDKError.Reason.INVALID_ADUNIT_BID_PAYLOAD_VALUE, 78, 169, 108, 86, 244, 234, 101, Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE, 174, 8, 186, 120, 37, 46, 28, 166, 180, 198, 232, Sdk.SDKError.Reason.AD_LOAD_FAIL_RETRY_AFTER_VALUE, 116, 31, 75, 189, TsExtractor.TS_STREAM_TYPE_DTS_UHD, 138, 112, 62, 181, 102, 72, 3, 246, 14, 97, 53, 87, 185, 134, 193, 29, 158, Sdk.SDKError.Reason.AD_LOAD_FAIL_PLACEMENT_ID_MISMATCH_VALUE, 248, 152, 17, 105, Sdk.SDKError.Reason.AD_RESPONSE_TIMED_OUT_VALUE, 142, 148, 155, 30, 135, 233, 206, 85, 40, Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE, 140, 161, Sdk.SDKError.Reason.TPAT_RETRY_FAILED_VALUE, 13, 191, 230, 66, 104, 65, 153, 45, 15, 176, 84, 187, 22};

    /* JADX INFO: renamed from: b */
    private byte[][] f33894b;

    public C12737h(C12748c c12748c) {
    }

    /* JADX INFO: renamed from: b */
    private C12746a m34963b(String str, Object obj, List<Object> list) {
        JSONArray jSONArray;
        if (obj == null) {
            return C12746a.m35016a("");
        }
        if (list.size() <= 0 || list.size() > 2) {
            return C12746a.m35016a(obj);
        }
        Object obj2 = list.get(0);
        Object obj3 = list.size() == 2 ? list.get(1) : null;
        String str2 = "[{\"m\":9,\"p\":22},{\"m\":1,\"p\":1},{\"m\":5,\"p\":19},{\"m\":7,\"p\":0}]";
        if (obj3 instanceof String) {
            try {
                String str3 = (String) obj3;
                if (!TextUtils.isEmpty(str3)) {
                    str2 = str3;
                }
                jSONArray = new JSONArray(str2);
            } catch (JSONException unused) {
                return C12746a.m35016a(obj);
            }
        } else if (obj3 instanceof JSONArray) {
            jSONArray = (JSONArray) obj3;
        } else {
            try {
                jSONArray = new JSONArray("[{\"m\":9,\"p\":22},{\"m\":1,\"p\":1},{\"m\":5,\"p\":19},{\"m\":7,\"p\":0}]");
            } catch (JSONException unused2) {
                jSONArray = null;
            }
        }
        if (!(obj2 instanceof String)) {
            return C12746a.m35016a(obj);
        }
        try {
            return str.equals(C12770c.m35209b("895")) ? m34960a((String) obj2, (String) obj, jSONArray) : C12746a.m35016a(null);
        } catch (Exception e) {
            C13219q0.m37816b("OperatorEncode", e.getMessage());
            return C12746a.m35016a(null);
        }
    }

    /* JADX INFO: renamed from: a */
    public C12746a m34964a(String str, Object obj, List<Object> list) {
        if (TextUtils.isEmpty(str)) {
            return C12746a.m35017c();
        }
        return str.equals(C12770c.m35209b("895")) ? m34963b(str, obj, list) : C12746a.m35017c();
    }

    /* JADX INFO: renamed from: a */
    private C12746a m34960a(String str, String str2, JSONArray jSONArray) {
        String strM37890a;
        m34961a(str);
        byte[] bArrDecode = Base64.decode(str2, 10);
        byte[] bArr = new byte[16];
        try {
            System.arraycopy(MessageDigest.getInstance("SHA-256").digest(str.getBytes(StandardCharsets.UTF_8)), 0, bArr, 0, 16);
        } catch (NoSuchAlgorithmException unused) {
        }
        try {
            strM37890a = C13229v0.m37890a(m34965a(bArrDecode, bArr, jSONArray));
        } catch (Exception e) {
            C13219q0.m37816b("OperatorEncode", e.getMessage());
            strM37890a = null;
        }
        return C12746a.m35016a(strM37890a);
    }

    /* JADX INFO: renamed from: a */
    private void m34961a(String str) {
        this.f33894b = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, 16, 16);
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            for (int i = 0; i < 16; i++) {
                System.arraycopy(messageDigest.digest((str + "_round_" + i).getBytes(StandardCharsets.UTF_8)), 0, this.f33894b[i], 0, 16);
            }
        } catch (Exception e) {
            C13219q0.m37816b("OperatorEncode", e.getMessage());
        }
    }

    /* JADX INFO: renamed from: a */
    private byte[] m34962a(byte[] bArr, JSONArray jSONArray) {
        byte[] bArrCopyOf = Arrays.copyOf(bArr, 16);
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
            String strOptString = jSONObjectOptJSONObject.optString(InneractiveMediationDefs.GENDER_MALE);
            strOptString.hashCode();
            strOptString.hashCode();
            switch (strOptString) {
                case "1":
                    byte[] bArr2 = this.f33894b[jSONObjectOptJSONObject.optInt("p") % 16];
                    for (int i2 = 0; i2 < 16; i2++) {
                        bArrCopyOf[i2] = (byte) (bArrCopyOf[i2] ^ bArr2[i2]);
                    }
                    break;
                case "2":
                    for (int i3 = 0; i3 < 16; i3++) {
                        bArrCopyOf[i3] = (byte) this.f33893a[bArrCopyOf[i3] & 255];
                    }
                    break;
                case "3":
                    int iOptInt = jSONObjectOptJSONObject.optInt("p") % 16;
                    if (iOptInt > 0) {
                        byte[] bArrCopyOf2 = Arrays.copyOf(bArrCopyOf, 16);
                        for (int i4 = 0; i4 < 16; i4++) {
                            bArrCopyOf[i4] = bArrCopyOf2[(i4 + iOptInt) % 16];
                        }
                        break;
                    } else {
                        break;
                    }
                    break;
                case "4":
                    for (int i5 = 0; i5 < 16; i5++) {
                        bArrCopyOf[i5] = (byte) (bArrCopyOf[i5] ^ ((byte) jSONObjectOptJSONObject.optInt("p")));
                    }
                    break;
                case "5":
                    for (int i6 = 0; i6 < 16; i6++) {
                        bArrCopyOf[i6] = (byte) (bArrCopyOf[i6] + jSONObjectOptJSONObject.optInt("p"));
                    }
                    break;
                case "6":
                    int iOptInt2 = jSONObjectOptJSONObject.optInt("p") % 8;
                    for (int i7 = 0; i7 < 16; i7++) {
                        int i8 = bArrCopyOf[i7] & 255;
                        bArrCopyOf[i7] = (byte) ((i8 >>> (8 - iOptInt2)) | (i8 << iOptInt2));
                    }
                    break;
                case "7":
                    int i9 = 0;
                    while (i9 < 16) {
                        int i10 = i9 + 1;
                        bArrCopyOf[i9] = (byte) (bArrCopyOf[i9] ^ bArrCopyOf[i10 % 16]);
                        i9 = i10;
                    }
                    break;
                case "8":
                    int iOptInt3 = jSONObjectOptJSONObject.optInt("p") % 16;
                    int i11 = iOptInt3 != 0 ? iOptInt3 : 1;
                    for (int i12 = 0; i12 < 16; i12 += 2) {
                        int i13 = (i12 + i11) % 16;
                        byte b = bArrCopyOf[i12];
                        bArrCopyOf[i12] = bArrCopyOf[i13];
                        bArrCopyOf[i13] = b;
                    }
                    break;
                case "9":
                    int iOptInt4 = ((jSONObjectOptJSONObject.optInt("p") % 128) * 2) + 1;
                    for (int i14 = 0; i14 < 16; i14++) {
                        bArrCopyOf[i14] = (byte) (bArrCopyOf[i14] * iOptInt4);
                    }
                    break;
            }
        }
        return bArrCopyOf;
    }

    /* JADX INFO: renamed from: a */
    public byte[] m34965a(byte[] bArr, byte[] bArr2, JSONArray jSONArray) {
        if (bArr2.length == 16) {
            byte[] bArr3 = new byte[bArr.length];
            byte[] bArrCopyOf = Arrays.copyOf(bArr2, 16);
            for (int i = 0; i < bArr.length; i += 16) {
                byte[] bArrM34962a = m34962a(bArrCopyOf, jSONArray);
                int iMin = Math.min(16, bArr.length - i);
                for (int i2 = 0; i2 < iMin; i2++) {
                    int i3 = i + i2;
                    bArr3[i3] = (byte) (bArr[i3] ^ bArrM34962a[i2]);
                }
                for (int i4 = 15; i4 >= 0; i4--) {
                    byte b = (byte) (bArrCopyOf[i4] + 1);
                    bArrCopyOf[i4] = b;
                    if (b != 0) {
                        break;
                    }
                }
            }
            return bArr3;
        }
        throw new IllegalArgumentException("IV length must be 16 bytes");
    }
}
