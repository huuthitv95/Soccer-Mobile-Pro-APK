package com.bytedance.sdk.component.pglcrypt;

import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.util.Pair;
import com.ironsource.C11341A5;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class PglCryptUtils {
    public static final int BASE64_FAILED = 504;
    public static final int COMPRESS_FAILED = 503;
    public static final int CRYPT_OK = 0;
    public static final int CYPHER_VERSION = 4;
    public static final int DECRYPT_FAILED = 506;
    public static final int ENCRYPT_FAILED = 505;
    public static final int INPUT_INVALID = 502;
    public static final String KEY_CYPHER = "cypher";
    public static final String KEY_MESSAGE = "message";
    public static final int LOAD_SO_FAILED = 501;
    public static final int UNKNOWN_ERR = 507;

    /* JADX INFO: renamed from: lr */
    private static volatile boolean f7681lr = true;

    /* JADX INFO: renamed from: ri */
    private static volatile PglCryptUtils f7682ri;

    private PglCryptUtils() {
    }

    /* JADX INFO: renamed from: bc */
    public static native byte[] m10099bc(int i, byte[] bArr);

    public static PglCryptUtils getInstance() {
        if (f7682ri == null) {
            synchronized (PglCryptUtils.class) {
                if (f7682ri == null) {
                    try {
                        System.loadLibrary("pglarmor");
                    } catch (Throwable unused) {
                        f7681lr = false;
                    }
                    f7682ri = new PglCryptUtils();
                }
            }
        }
        return f7682ri;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0068 A[Catch: Exception -> 0x0064, TRY_LEAVE, TryCatch #5 {Exception -> 0x0064, blocks: (B:31:0x0060, B:35:0x0068), top: B:61:0x0060 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x0082 A[Catch: Exception -> 0x007e, TRY_LEAVE, TryCatch #0 {Exception -> 0x007e, blocks: (B:43:0x007a, B:47:0x0082), top: B:52:0x007a }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.util.zip.GZIPInputStream] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.zip.GZIPInputStream] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.util.zip.GZIPInputStream] */
    /* JADX WARN: Type inference failed for: r8v0, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v11, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13, types: [java.io.ByteArrayOutputStream] */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.io.ByteArrayOutputStream] */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8, types: [java.io.ByteArrayOutputStream] */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX INFO: renamed from: ri */
    private static String m10100ri(byte[] bArr) throws Throwable {
        ?? gZIPInputStream;
        Throwable th;
        ?? string;
        Exception exc;
        String str;
        String string2 = null;
        string2 = null;
         = 0;
        ?? r1 = 0;
        if (bArr != 0) {
            try {
                if (bArr.length != 0) {
                    try {
                        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
                        bArr = new ByteArrayOutputStream();
                        try {
                            gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
                            try {
                                byte[] bArr2 = new byte[1024];
                                while (true) {
                                    int i = gZIPInputStream.read(bArr2);
                                    if (i == -1) {
                                        break;
                                    }
                                    bArr.write(bArr2, 0, i);
                                }
                                string2 = bArr.toString(C11341A5.f23802O);
                                byteArrayInputStream.close();
                                try {
                                    gZIPInputStream.close();
                                    bArr.close();
                                    bArr = bArr;
                                } catch (Exception e) {
                                    String string3 = e.toString();
                                    Log.e("ARMOR", string3);
                                    bArr = string3;
                                }
                            } catch (Exception e2) {
                                str = string2;
                                r1 = gZIPInputStream;
                                exc = e2;
                                string = bArr;
                                Log.e("ARMOR", exc.toString());
                                if (r1 != 0) {
                                    try {
                                        r1.close();
                                        if (string != 0) {
                                            string.close();
                                        }
                                    } catch (Exception e3) {
                                        string = e3.toString();
                                        Log.e("ARMOR", string);
                                        string2 = str;
                                        bArr = string;
                                        return string2;
                                    }
                                } else if (string != 0) {
                                    string.close();
                                }
                                string2 = str;
                                bArr = string;
                            } catch (Throwable th2) {
                                th = th2;
                                if (gZIPInputStream != 0) {
                                    try {
                                        gZIPInputStream.close();
                                        if (bArr != 0) {
                                            bArr.close();
                                        }
                                    } catch (Exception e4) {
                                        Log.e("ARMOR", e4.toString());
                                        throw th;
                                    }
                                } else if (bArr != 0) {
                                    bArr.close();
                                }
                                throw th;
                            }
                        } catch (Exception e5) {
                            exc = e5;
                            str = null;
                            string = bArr;
                        }
                    } catch (Exception e6) {
                        string = 0;
                        exc = e6;
                        str = null;
                    } catch (Throwable th3) {
                        gZIPInputStream = 0;
                        th = th3;
                        bArr = 0;
                    }
                    return string2;
                }
            } catch (Throwable th4) {
                gZIPInputStream = string2;
                th = th4;
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0063 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:39:0x0065 A[Catch: Exception -> 0x0061, TRY_LEAVE, TryCatch #7 {Exception -> 0x0061, blocks: (B:35:0x005d, B:39:0x0065), top: B:48:0x005d }] */
    /* JADX WARN: Code duplicated, block: B:48:0x005d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: ri */
    private static byte[] m10101ri(String str) throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream;
        GZIPOutputStream gZIPOutputStream;
        GZIPOutputStream gZIPOutputStream2 = null;
        if (str != null) {
            try {
                if (str.length() != 0) {
                    try {
                        byteArrayOutputStream = new ByteArrayOutputStream();
                        try {
                            gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                            try {
                                try {
                                    gZIPOutputStream.write(str.getBytes(C11341A5.f23802O));
                                    gZIPOutputStream.close();
                                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                                    byteArrayOutputStream.close();
                                    return byteArray;
                                } catch (Exception e) {
                                    e = e;
                                    Log.e("ARMOR", e.toString());
                                    if (gZIPOutputStream != null) {
                                        gZIPOutputStream.close();
                                    }
                                    if (byteArrayOutputStream == null) {
                                        return null;
                                    }
                                    byte[] byteArray2 = byteArrayOutputStream.toByteArray();
                                    byteArrayOutputStream.close();
                                    return byteArray2;
                                }
                            } catch (Throwable th) {
                                th = th;
                                gZIPOutputStream2 = gZIPOutputStream;
                                if (gZIPOutputStream2 != null) {
                                    try {
                                        gZIPOutputStream2.close();
                                        if (byteArrayOutputStream != null) {
                                            byteArrayOutputStream.toByteArray();
                                            byteArrayOutputStream.close();
                                        }
                                    } catch (Exception e2) {
                                        Log.e("ARMOR", e2.toString());
                                        throw th;
                                    }
                                } else if (byteArrayOutputStream != null) {
                                    byteArrayOutputStream.toByteArray();
                                    byteArrayOutputStream.close();
                                }
                                throw th;
                            }
                        } catch (Exception e3) {
                            e = e3;
                            gZIPOutputStream = null;
                        } catch (Throwable th2) {
                            th = th2;
                            if (gZIPOutputStream2 != null) {
                                gZIPOutputStream2.close();
                                if (byteArrayOutputStream != null) {
                                    byteArrayOutputStream.toByteArray();
                                    byteArrayOutputStream.close();
                                }
                            } else if (byteArrayOutputStream != null) {
                                byteArrayOutputStream.toByteArray();
                                byteArrayOutputStream.close();
                            }
                            throw th;
                        }
                    } catch (Exception e4) {
                        e = e4;
                        byteArrayOutputStream = null;
                        gZIPOutputStream = null;
                    } catch (Throwable th3) {
                        th = th3;
                        byteArrayOutputStream = null;
                    }
                }
            } catch (Exception e5) {
                Log.e("ARMOR", e5.toString());
                return null;
            }
        }
        return null;
    }

    public Pair<Integer, String> cypher4Decrypt(String str) throws Throwable {
        byte[] bArrM10099bc;
        if (!f7681lr) {
            return new Pair<>(501, null);
        }
        if (str == null || str.length() == 0) {
            return new Pair<>(502, null);
        }
        byte[] bArrDecode = Base64.decode(str, 0);
        if (bArrDecode == null || bArrDecode.length == 0) {
            return new Pair<>(504, null);
        }
        try {
            bArrM10099bc = m10099bc(1011, bArrDecode);
        } catch (Throwable th) {
            Log.e("ARMOR", th.toString());
            bArrM10099bc = null;
        }
        if (bArrM10099bc == null || bArrM10099bc.length == 0) {
            return new Pair<>(506, null);
        }
        String strM10100ri = m10100ri(bArrM10099bc);
        return TextUtils.isEmpty(strM10100ri) ? new Pair<>(503, null) : new Pair<>(0, strM10100ri);
    }

    public Pair<Integer, JSONObject> cypher4Encrypt(JSONObject jSONObject) throws Throwable {
        Pair<Integer, String> pairCypher4EncryptWithNoWrapBase64 = cypher4EncryptWithNoWrapBase64(jSONObject.toString());
        if (pairCypher4EncryptWithNoWrapBase64 == null) {
            return new Pair<>(507, null);
        }
        if (((Integer) pairCypher4EncryptWithNoWrapBase64.first).intValue() != 0) {
            return new Pair<>(pairCypher4EncryptWithNoWrapBase64.first, null);
        }
        JSONObject jSONObject2 = new JSONObject();
        String str = (String) pairCypher4EncryptWithNoWrapBase64.second;
        if (TextUtils.isEmpty(str)) {
            return new Pair<>(504, null);
        }
        jSONObject2.put("message", str);
        jSONObject2.put("cypher", 4);
        return new Pair<>(0, jSONObject2);
    }

    public Pair<Integer, byte[]> cypher4Encrypt(byte[] bArr) {
        byte[] bArrM10099bc;
        if (!f7681lr) {
            return new Pair<>(501, null);
        }
        if (bArr == null || bArr.length == 0) {
            return new Pair<>(502, null);
        }
        try {
            bArrM10099bc = m10099bc(1010, bArr);
        } catch (Throwable th) {
            Log.e("ARMOR", th.toString());
            bArrM10099bc = null;
        }
        return (bArrM10099bc == null || bArrM10099bc.length == 0) ? new Pair<>(505, null) : new Pair<>(0, bArrM10099bc);
    }

    public Pair<Integer, String> cypher4EncryptWithNoWrapBase64(String str) throws Throwable {
        if (!f7681lr) {
            return new Pair<>(501, null);
        }
        if (TextUtils.isEmpty(str)) {
            return new Pair<>(502, null);
        }
        byte[] bArrM10101ri = m10101ri(str);
        if (bArrM10101ri == null || bArrM10101ri.length == 0) {
            return new Pair<>(503, null);
        }
        Pair<Integer, byte[]> pairCypher4Encrypt = cypher4Encrypt(bArrM10101ri);
        if (pairCypher4Encrypt == null) {
            return new Pair<>(507, null);
        }
        if (((Integer) pairCypher4Encrypt.first).intValue() != 0) {
            return new Pair<>(pairCypher4Encrypt.first, null);
        }
        String strEncodeToString = Base64.encodeToString((byte[]) pairCypher4Encrypt.second, 2);
        return TextUtils.isEmpty(strEncodeToString) ? new Pair<>(504, null) : new Pair<>(0, strEncodeToString);
    }
}
