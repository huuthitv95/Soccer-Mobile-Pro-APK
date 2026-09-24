package com.mbridge.msdk.config.component.common.express.operator;

import android.text.TextUtils;
import android.util.Base64;
import androidx.media3.extractor.p007ts.TsExtractor;
import androidx.recyclerview.widget.ItemTouchHelper;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.facebook.internal.FacebookRequestErrorClassification;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.mbridge.msdk.config.component.common.express.operator.parts.C12746a;
import com.mbridge.msdk.config.component.common.express.operator.parts.C12748c;
import com.mbridge.msdk.config.component.common.util.C12770c;
import com.mbridge.msdk.foundation.tools.C13219q0;
import com.vungle.ads.internal.protos.Sdk;
import java.lang.reflect.Array;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: com.mbridge.msdk.config.component.common.express.operator.g */
/* JADX INFO: compiled from: OperatorEnMethod.java */
/* JADX INFO: loaded from: classes5.dex */
public class C12736g {

    /* JADX INFO: renamed from: a */
    private int[] f33891a = {99, 124, Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE, Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE, 242, 107, 111, 197, 48, 1, 103, 43, 254, Sdk.SDKError.Reason.AD_RESPONSE_EMPTY_VALUE, 171, Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE, 202, 130, 201, Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE, ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION, 89, 71, 240, TTAdConstant.IMAGE_MODE_VERTICAL_IMG_173, Sdk.SDKError.Reason.PLACEMENT_SLEEP_VALUE, 162, 175, 156, 164, 114, 192, 183, 253, 147, 38, 54, 63, 247, 204, 52, 165, 229, 241, 113, Sdk.SDKError.Reason.AD_RESPONSE_INVALID_TEMPLATE_TYPE_VALUE, 49, 21, 4, 199, 35, 195, 24, 150, 5, 154, 7, 18, 128, Sdk.SDKError.Reason.PRIVACY_ICON_FALLBACK_ERROR_VALUE, 235, 39, 178, Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE, 9, Sdk.SDKError.Reason.MRAID_JS_WRITE_FAILED_VALUE, 44, 26, 27, 110, 90, 160, 82, 59, Sdk.SDKError.Reason.INVALID_GZIP_BID_PAYLOAD_VALUE, 179, 41, Sdk.SDKError.Reason.INVALID_CSB_DATA_VALUE, 47, Sdk.SDKError.Reason.OMSDK_DOWNLOAD_JS_ERROR_VALUE, 83, Sdk.SDKError.Reason.INVALID_JSON_BID_PAYLOAD_VALUE, 0, 237, 32, 252, 177, 91, 106, 203, FacebookRequestErrorClassification.EC_INVALID_TOKEN, 57, 74, 76, 88, 207, Sdk.SDKError.Reason.INVALID_BID_PAYLOAD_VALUE, 239, 170, 251, 67, 77, 51, Sdk.SDKError.Reason.OMSDK_JS_WRITE_FAILED_VALUE, 69, 249, 2, 127, 80, 60, 159, 168, 81, 163, 64, 143, 146, 157, 56, 245, 188, 182, Sdk.SDKError.Reason.MRAID_JS_DOES_NOT_EXIST_VALUE, 33, 16, 255, 243, Sdk.SDKError.Reason.AD_NOT_LOADED_VALUE, 205, 12, 19, 236, 95, 151, 68, 23, 196, 167, 126, 61, 100, 93, 25, 115, 96, 129, 79, Sdk.SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE, 34, 42, 144, 136, 70, 238, 184, 20, Sdk.SDKError.Reason.INVALID_WATERFALL_PLACEMENT_ID_VALUE, 94, 11, Sdk.SDKError.Reason.MRAID_JS_COPY_FAILED_VALUE, 224, 50, 58, 10, 73, 6, 36, 92, 194, 211, 172, 98, 145, 149, 228, Sdk.SDKError.Reason.TPAT_ERROR_VALUE, 231, 200, 55, 109, ModuleDescriptor.MODULE_VERSION, Sdk.SDKError.Reason.INVALID_ADUNIT_BID_PAYLOAD_VALUE, 78, 169, 108, 86, 244, 234, 101, Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE, 174, 8, 186, 120, 37, 46, 28, 166, 180, 198, 232, Sdk.SDKError.Reason.AD_LOAD_FAIL_RETRY_AFTER_VALUE, 116, 31, 75, 189, TsExtractor.TS_STREAM_TYPE_DTS_UHD, 138, 112, 62, 181, 102, 72, 3, 246, 14, 97, 53, 87, 185, 134, 193, 29, 158, Sdk.SDKError.Reason.AD_LOAD_FAIL_PLACEMENT_ID_MISMATCH_VALUE, 248, 152, 17, 105, Sdk.SDKError.Reason.AD_RESPONSE_TIMED_OUT_VALUE, 142, 148, 155, 30, 135, 233, 206, 85, 40, Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE, 140, 161, Sdk.SDKError.Reason.TPAT_RETRY_FAILED_VALUE, 13, 191, 230, 66, 104, 65, 153, 45, 15, 176, 84, 187, 22};

    /* JADX INFO: renamed from: b */
    private byte[][] f33892b;

    public C12736g(C12748c c12748c) {
    }

    /* JADX INFO: renamed from: b */
    private C12746a m34950b(String str, Object obj, List<Object> list) {
        if (obj == null) {
            return C12746a.m35016a("");
        }
        try {
            if (str.equals(C12770c.m35209b("886"))) {
                return m34947a(obj, list);
            }
            if (str.equals(C12770c.m35209b("887"))) {
                return m34955f(obj, list);
            }
            if (str.equals(C12770c.m35209b("888"))) {
                return m34954e(obj, list);
            }
            if (str.equals(C12770c.m35209b("889"))) {
                return m34957h(obj, list);
            }
            if (str.equals(C12770c.m35209b("890"))) {
                return m34949b(obj, list);
            }
            if (str.equals(C12770c.m35209b("891"))) {
                return m34952c(obj, list);
            }
            if (str.equals(C12770c.m35209b("892"))) {
                return m34958i(obj, list);
            }
            if (str.equals(C12770c.m35209b("893"))) {
                return m34956g(obj, list);
            }
            if (str.equals(C12770c.m35209b("894"))) {
                return m34953d(obj, list);
            }
            return C12746a.m35016a("");
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: c */
    private C12746a m34952c(Object obj, List<Object> list) {
        if (obj == null || !(obj instanceof String) || list == null || list.size() != 1) {
            return C12746a.m35016a("");
        }
        byte[] bArrDecode = Base64.decode(obj.toString(), 10);
        if (bArrDecode.length < 16) {
            return C12746a.m35016a("");
        }
        if (bArrDecode.length > 16) {
            bArrDecode = Arrays.copyOf(bArrDecode, 16);
        }
        int i = Integer.parseInt(list.get(0).toString()) % 8;
        for (int i2 = 0; i2 < 16; i2++) {
            int i3 = bArrDecode[i2] & 255;
            bArrDecode[i2] = (byte) ((i3 >>> (8 - i)) | (i3 << i));
        }
        return C12746a.m35016a(Base64.encodeToString(bArrDecode, 10));
    }

    /* JADX INFO: renamed from: d */
    private C12746a m34953d(Object obj, List<Object> list) {
        if (obj == null || !(obj instanceof String) || list == null || list.size() != 1) {
            return C12746a.m35016a("");
        }
        byte[] bArrDecode = Base64.decode(obj.toString(), 10);
        if (bArrDecode.length < 16) {
            return C12746a.m35016a("");
        }
        if (bArrDecode.length > 16) {
            bArrDecode = Arrays.copyOf(bArrDecode, 16);
        }
        int i = ((Integer.parseInt(list.get(0).toString()) % 128) * 2) + 1;
        for (int i2 = 0; i2 < 16; i2++) {
            bArrDecode[i2] = (byte) (bArrDecode[i2] * i);
        }
        return C12746a.m35016a(Base64.encodeToString(bArrDecode, 10));
    }

    /* JADX INFO: renamed from: e */
    private C12746a m34954e(Object obj, List<Object> list) {
        if (obj == null || !(obj instanceof String) || list == null || list.size() != 1) {
            return C12746a.m35016a("");
        }
        byte[] bArrDecode = Base64.decode(obj.toString(), 10);
        if (bArrDecode.length < 16) {
            return C12746a.m35016a("");
        }
        if (bArrDecode.length > 16) {
            bArrDecode = Arrays.copyOf(bArrDecode, 16);
        }
        int i = Integer.parseInt(list.get(0).toString()) % 16;
        if (i > 0) {
            byte[] bArrCopyOf = Arrays.copyOf(bArrDecode, 16);
            for (int i2 = 0; i2 < 16; i2++) {
                bArrDecode[i2] = bArrCopyOf[(i2 + i) % 16];
            }
        }
        return C12746a.m35016a(Base64.encodeToString(bArrDecode, 10));
    }

    /* JADX INFO: renamed from: f */
    private C12746a m34955f(Object obj, List<Object> list) {
        if (obj == null || !(obj instanceof String) || list == null || list.size() != 1) {
            return C12746a.m35016a("");
        }
        byte[] bArrDecode = Base64.decode(obj.toString(), 10);
        if (bArrDecode.length < 16) {
            return C12746a.m35016a("");
        }
        if (bArrDecode.length > 16) {
            bArrDecode = Arrays.copyOf(bArrDecode, 16);
        }
        for (int i = 0; i < 16; i++) {
            bArrDecode[i] = (byte) this.f33891a[bArrDecode[i] & 255];
        }
        return C12746a.m35016a(Base64.encodeToString(bArrDecode, 10));
    }

    /* JADX INFO: renamed from: g */
    private C12746a m34956g(Object obj, List<Object> list) {
        if (obj != null && (obj instanceof String) && list != null) {
            if (list.size() == 1) {
                byte[] bArrDecode = Base64.decode(obj.toString(), 10);
                if (bArrDecode.length < 16) {
                    return C12746a.m35016a("");
                }
                if (bArrDecode.length > 16) {
                    bArrDecode = Arrays.copyOf(bArrDecode, 16);
                }
                int i = Integer.parseInt(list.get(0).toString()) % 16;
                int i2 = i != 0 ? i : 1;
                for (int i3 = 0; i3 < 16; i3 += 2) {
                    int i4 = (i3 + i2) % 16;
                    byte b = bArrDecode[i3];
                    bArrDecode[i3] = bArrDecode[i4];
                    bArrDecode[i4] = b;
                }
                return C12746a.m35016a(Base64.encodeToString(bArrDecode, 10));
            }
        }
        return C12746a.m35016a("");
    }

    /* JADX INFO: renamed from: h */
    private C12746a m34957h(Object obj, List<Object> list) {
        if (obj == null || !(obj instanceof String) || list == null || list.size() != 1) {
            return C12746a.m35016a("");
        }
        byte[] bArrDecode = Base64.decode(obj.toString(), 10);
        if (bArrDecode.length < 16) {
            return C12746a.m35016a("");
        }
        if (bArrDecode.length > 16) {
            bArrDecode = Arrays.copyOf(bArrDecode, 16);
        }
        for (int i = 0; i < 16; i++) {
            bArrDecode[i] = (byte) (bArrDecode[i] ^ ((byte) Integer.parseInt(list.get(0).toString())));
        }
        return C12746a.m35016a(Base64.encodeToString(bArrDecode, 10));
    }

    /* JADX INFO: renamed from: i */
    private C12746a m34958i(Object obj, List<Object> list) {
        if (obj == null || !(obj instanceof String) || list == null || list.size() != 1) {
            return C12746a.m35016a("");
        }
        byte[] bArrDecode = Base64.decode(obj.toString(), 10);
        if (bArrDecode.length < 16) {
            return C12746a.m35016a("");
        }
        if (bArrDecode.length > 16) {
            bArrDecode = Arrays.copyOf(bArrDecode, 16);
        }
        int i = 0;
        while (i < 16) {
            int i2 = i + 1;
            bArrDecode[i] = (byte) (bArrDecode[i] ^ bArrDecode[i2 % 16]);
            i = i2;
        }
        return C12746a.m35016a(Base64.encodeToString(bArrDecode, 10));
    }

    /* JADX INFO: renamed from: a */
    public C12746a m34959a(String str, Object obj, List<Object> list) {
        if (TextUtils.isEmpty(str)) {
            return C12746a.m35017c();
        }
        return m34951b(str) ? m34950b(str, obj, list) : C12746a.m35017c();
    }

    /* JADX INFO: renamed from: a */
    private void m34948a(String str) {
        this.f33892b = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, 16, 16);
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            for (int i = 0; i < 16; i++) {
                System.arraycopy(messageDigest.digest((str + "_round_" + i).getBytes(StandardCharsets.UTF_8)), 0, this.f33892b[i], 0, 16);
            }
        } catch (Exception e) {
            C13219q0.m37816b("OperatorEnMethod", e.getMessage());
        }
    }

    /* JADX INFO: renamed from: b */
    private C12746a m34949b(Object obj, List<Object> list) {
        if (obj != null && (obj instanceof String) && list != null && list.size() == 1) {
            byte[] bArrDecode = Base64.decode(obj.toString(), 10);
            if (bArrDecode.length < 16) {
                return C12746a.m35016a("");
            }
            if (bArrDecode.length > 16) {
                bArrDecode = Arrays.copyOf(bArrDecode, 16);
            }
            for (int i = 0; i < 16; i++) {
                bArrDecode[i] = (byte) (bArrDecode[i] + Integer.parseInt(list.get(0).toString()));
            }
            return C12746a.m35016a(Base64.encodeToString(bArrDecode, 10));
        }
        return C12746a.m35016a("");
    }

    /* JADX INFO: renamed from: a */
    private C12746a m34947a(Object obj, List<Object> list) {
        if (obj != null && (obj instanceof String) && list != null && list.size() == 1) {
            String string = obj.toString();
            byte[] bArrDecode = Base64.decode(string, 10);
            if (bArrDecode.length < 16) {
                return C12746a.m35016a("");
            }
            if (bArrDecode.length > 16) {
                bArrDecode = Arrays.copyOf(bArrDecode, 16);
            }
            m34948a(string);
            byte[] bArr = this.f33892b[Integer.parseInt(list.get(0).toString()) % 16];
            for (int i = 0; i < 16; i++) {
                bArrDecode[i] = (byte) (bArrDecode[i] ^ bArr[i]);
            }
            return C12746a.m35016a(Base64.encodeToString(bArrDecode, 10));
        }
        return C12746a.m35016a("");
    }

    /* JADX INFO: renamed from: b */
    private boolean m34951b(String str) {
        return str.equals(C12770c.m35209b("886")) || str.equals(C12770c.m35209b("887")) || str.equals(C12770c.m35209b("888")) || str.equals(C12770c.m35209b("889")) || str.equals(C12770c.m35209b("890")) || str.equals(C12770c.m35209b("891")) || str.equals(C12770c.m35209b("892")) || str.equals(C12770c.m35209b("893")) || str.equals(C12770c.m35209b("894"));
    }
}
