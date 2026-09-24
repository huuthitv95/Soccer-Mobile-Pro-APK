package com.mbridge.msdk.foundation.download.download;

import android.webkit.URLUtil;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.same.net.MBridgeHostnameVerifier;
import com.mbridge.msdk.foundation.same.task.AbstractRunnableC13163a;
import com.mbridge.msdk.foundation.tools.C13182a1;
import com.mbridge.msdk.foundation.tools.C13219q0;
import java.io.ByteArrayOutputStream;
import java.net.URL;
import javax.net.ssl.HttpsURLConnection;

/* JADX INFO: loaded from: classes6.dex */
public class DownLoadUtils {
    private static final int DOWNLOAD_CONNECTION_TIME_OUT = 20000;
    private static final int DOWNLOAD_READ_TIME_OUT = 30000;
    public static final String END_TAG = "<mbridgeloadend></mbridgeloadend>";
    private static final String TAG = "DownLoadUtils";

    public static void getSourceCodeFromNetUrl(final String str, final H5DownLoadManager.IOnDownLoadH5Source iOnDownLoadH5Source, final boolean z) {
        try {
            if (!C13182a1.m37596a(str) && URLUtil.isNetworkUrl(str)) {
                DownloadTask.getInstance().runTask(new AbstractRunnableC13163a() { // from class: com.mbridge.msdk.foundation.download.download.DownLoadUtils.1
                    @Override // com.mbridge.msdk.foundation.same.task.AbstractRunnableC13163a
                    public void cancelTask() {
                    }

                    @Override // com.mbridge.msdk.foundation.same.task.AbstractRunnableC13163a
                    public void pauseTask(boolean z2) {
                    }

                    /* JADX WARN: Code duplicated, block: B:105:0x0173 A[DONT_INVERT] */
                    /* JADX WARN: Code duplicated, block: B:106:0x0175 A[Catch: Exception -> 0x0171, TRY_LEAVE, TryCatch #8 {Exception -> 0x0171, blocks: (B:102:0x016d, B:106:0x0175), top: B:119:0x016d }] */
                    /* JADX WARN: Code duplicated, block: B:117:0x00ee A[EXC_TOP_SPLITTER, SYNTHETIC] */
                    /* JADX WARN: Code duplicated, block: B:119:0x016d A[EXC_TOP_SPLITTER, SYNTHETIC] */
                    /* JADX WARN: Code duplicated, block: B:124:0x0104 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                    /* JADX WARN: Code duplicated, block: B:60:0x00f4 A[DONT_INVERT] */
                    /* JADX WARN: Code duplicated, block: B:61:0x00f6 A[Catch: Exception -> 0x00f2, TRY_LEAVE, TryCatch #7 {Exception -> 0x00f2, blocks: (B:57:0x00ee, B:61:0x00f6), top: B:117:0x00ee }] */
                    /* JADX WARN: Code duplicated, block: B:68:0x0108 A[ADDED_TO_REGION] */
                    /* JADX WARN: Code duplicated, block: B:74:0x0117  */
                    /* JADX WARN: Code duplicated, block: B:75:0x0119 A[Catch: all -> 0x0115, TryCatch #10 {all -> 0x0115, blocks: (B:66:0x0104, B:69:0x010a, B:71:0x010d, B:75:0x0119, B:77:0x011f, B:79:0x0125, B:81:0x012d, B:83:0x0131, B:84:0x0137, B:86:0x013b), top: B:124:0x0104 }] */
                    /* JADX WARN: Code duplicated, block: B:84:0x0137 A[Catch: all -> 0x0115, TryCatch #10 {all -> 0x0115, blocks: (B:66:0x0104, B:69:0x010a, B:71:0x010d, B:75:0x0119, B:77:0x011f, B:79:0x0125, B:81:0x012d, B:83:0x0131, B:84:0x0137, B:86:0x013b), top: B:124:0x0104 }] */
                    /* JADX WARN: Code duplicated, block: B:86:0x013b A[Catch: all -> 0x0115, TRY_LEAVE, TryCatch #10 {all -> 0x0115, blocks: (B:66:0x0104, B:69:0x010a, B:71:0x010d, B:75:0x0119, B:77:0x011f, B:79:0x0125, B:81:0x012d, B:83:0x0131, B:84:0x0137, B:86:0x013b), top: B:124:0x0104 }] */
                    /* JADX WARN: Instruction removed from duplicated block: B:86:0x013b, please report this as an issue */
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r0v18, types: [com.mbridge.msdk.foundation.download.download.H5DownLoadManager$IOnDownLoadH5Source] */
                    /* JADX WARN: Type inference failed for: r11v0 */
                    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.String] */
                    /* JADX WARN: Type inference failed for: r1v10 */
                    /* JADX WARN: Type inference failed for: r1v11 */
                    /* JADX WARN: Type inference failed for: r1v18 */
                    /* JADX WARN: Type inference failed for: r1v19, types: [java.io.InputStream] */
                    /* JADX WARN: Type inference failed for: r1v2 */
                    /* JADX WARN: Type inference failed for: r1v21, types: [java.io.InputStream] */
                    /* JADX WARN: Type inference failed for: r1v23 */
                    /* JADX WARN: Type inference failed for: r1v24 */
                    /* JADX WARN: Type inference failed for: r1v25 */
                    /* JADX WARN: Type inference failed for: r1v26 */
                    /* JADX WARN: Type inference failed for: r1v27 */
                    /* JADX WARN: Type inference failed for: r1v3 */
                    /* JADX WARN: Type inference failed for: r1v4 */
                    /* JADX WARN: Type inference failed for: r1v6, types: [java.io.InputStream] */
                    /* JADX WARN: Type inference failed for: r1v8, types: [java.io.InputStream] */
                    /* JADX WARN: Type inference failed for: r2v1 */
                    /* JADX WARN: Type inference failed for: r2v16 */
                    /* JADX WARN: Type inference failed for: r2v19 */
                    /* JADX WARN: Type inference failed for: r2v2 */
                    /* JADX WARN: Type inference failed for: r2v28 */
                    /* JADX WARN: Type inference failed for: r2v7 */
                    /* JADX WARN: Type inference failed for: r3v0 */
                    /* JADX WARN: Type inference failed for: r3v1 */
                    /* JADX WARN: Type inference failed for: r3v2 */
                    /* JADX WARN: Type inference failed for: r6v0 */
                    /* JADX WARN: Type inference failed for: r6v14 */
                    /* JADX WARN: Type inference failed for: r6v15, types: [java.io.ByteArrayOutputStream] */
                    /* JADX WARN: Type inference failed for: r6v16 */
                    /* JADX WARN: Type inference failed for: r6v17, types: [java.io.ByteArrayOutputStream] */
                    /* JADX WARN: Type inference failed for: r6v18 */
                    /* JADX WARN: Type inference failed for: r6v19 */
                    /* JADX WARN: Type inference failed for: r6v2 */
                    /* JADX WARN: Type inference failed for: r6v20 */
                    /* JADX WARN: Type inference failed for: r6v21 */
                    /* JADX WARN: Type inference failed for: r6v22 */
                    /* JADX WARN: Type inference failed for: r6v23 */
                    /* JADX WARN: Type inference failed for: r6v24 */
                    /* JADX WARN: Type inference failed for: r6v25 */
                    /* JADX WARN: Type inference failed for: r6v26 */
                    /* JADX WARN: Type inference failed for: r6v3 */
                    /* JADX WARN: Type inference failed for: r6v5, types: [java.io.ByteArrayOutputStream] */
                    /* JADX WARN: Type inference failed for: r6v6, types: [java.io.ByteArrayOutputStream] */
                    /* JADX WARN: Type inference failed for: r6v7 */
                    /* JADX WARN: Type inference failed for: r6v8 */
                    /* JADX WARN: Type inference failed for: r7v17 */
                    /* JADX WARN: Type inference failed for: r7v18 */
                    /* JADX WARN: Type inference failed for: r7v19 */
                    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.String] */
                    /* JADX WARN: Type inference fix 'apply assigned field type' failed
                    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                     */
                    @Override // com.mbridge.msdk.foundation.same.task.AbstractRunnableC13163a
                    public void runTask() throws Throwable {
                        ?? byteArrayOutputStream;
                        ?? r2;
                        byte[] bArr;
                        ?? r6;
                        Object obj;
                        Object obj2;
                        ?? r7;
                        Exception e;
                        ?? r1;
                        String message;
                        byte[] byteArray;
                        ?? r8;
                        ?? r3;
                        ?? r9;
                        H5DownLoadManager.IOnDownLoadH5Source iOnDownLoadH5Source2;
                        ?? r4;
                        ?? r10;
                        String str2;
                        boolean z2;
                        String str3;
                        ?? inputStream = "responseCode is ";
                        ?? r5 = 0;
                        boolean z3 = false;
                        try {
                            try {
                                H5DownLoadManager.IOnDownLoadH5Source iOnDownLoadH5Source3 = iOnDownLoadH5Source;
                                if (iOnDownLoadH5Source3 != null) {
                                    iOnDownLoadH5Source3.onStart();
                                }
                                HttpsURLConnection httpsURLConnection = (HttpsURLConnection) new URL(str).openConnection();
                                httpsURLConnection.setHostnameVerifier(new MBridgeHostnameVerifier(str));
                                httpsURLConnection.setReadTimeout(30000);
                                httpsURLConnection.setConnectTimeout(20000);
                                int responseCode = httpsURLConnection.getResponseCode();
                                C13219q0.m37813a(DownLoadUtils.TAG, "response code " + responseCode);
                                if (responseCode == 200) {
                                    inputStream = httpsURLConnection.getInputStream();
                                    try {
                                        byte[] bArr2 = new byte[6144];
                                        byteArrayOutputStream = new ByteArrayOutputStream();
                                        while (true) {
                                            try {
                                                try {
                                                    int i = inputStream.read(bArr2);
                                                    if (i == -1) {
                                                        break;
                                                    } else {
                                                        byteArrayOutputStream.write(bArr2, 0, i);
                                                    }
                                                } catch (Throwable th) {
                                                    th = th;
                                                    if (inputStream != 0) {
                                                        try {
                                                            inputStream.close();
                                                            if (byteArrayOutputStream != 0) {
                                                                byteArrayOutputStream.close();
                                                            }
                                                        } catch (Exception e2) {
                                                            e2.printStackTrace();
                                                            e2.getMessage();
                                                            throw th;
                                                        }
                                                    } else if (byteArrayOutputStream != 0) {
                                                        byteArrayOutputStream.close();
                                                    }
                                                    throw th;
                                                }
                                            } catch (Exception e3) {
                                                e = e3;
                                                bArr = null;
                                            }
                                        }
                                        if (byteArrayOutputStream.toByteArray() != null) {
                                            byteArray = byteArrayOutputStream.toByteArray();
                                            try {
                                                str3 = !z ? new String(byteArray) : null;
                                            } catch (Exception e4) {
                                                bArr = byteArray;
                                                e = e4;
                                                obj2 = null;
                                                r1 = inputStream;
                                                r7 = byteArrayOutputStream;
                                                message = e.getMessage();
                                                C13219q0.m37816b(DownLoadUtils.TAG, "getStringFromUrl failed " + e.getLocalizedMessage());
                                                if (r1 != 0) {
                                                    try {
                                                        r1.close();
                                                        if (r7 != 0) {
                                                            r7.close();
                                                        }
                                                    } catch (Exception e5) {
                                                        e5.printStackTrace();
                                                        message = e5.getMessage();
                                                        byteArray = bArr;
                                                        inputStream = r1;
                                                        r6 = r7;
                                                        r9 = obj2;
                                                        if (z3) {
                                                            try {
                                                                if (!z) {
                                                                    if (!z3) {
                                                                        iOnDownLoadH5Source2 = iOnDownLoadH5Source;
                                                                        if (iOnDownLoadH5Source2 != null) {
                                                                            iOnDownLoadH5Source2.onFailed("content write failed:" + message);
                                                                        }
                                                                    } else {
                                                                        iOnDownLoadH5Source2 = iOnDownLoadH5Source;
                                                                        if (iOnDownLoadH5Source2 != null) {
                                                                            iOnDownLoadH5Source2.onFailed("content write failed:" + message);
                                                                        }
                                                                    }
                                                                } else if (!z3) {
                                                                    iOnDownLoadH5Source2 = iOnDownLoadH5Source;
                                                                    if (iOnDownLoadH5Source2 != null) {
                                                                        iOnDownLoadH5Source2.onFailed("content write failed:" + message);
                                                                    }
                                                                } else {
                                                                    iOnDownLoadH5Source2 = iOnDownLoadH5Source;
                                                                    if (iOnDownLoadH5Source2 != null) {
                                                                        iOnDownLoadH5Source2.onFailed("content write failed:" + message);
                                                                    }
                                                                }
                                                            } catch (Throwable th2) {
                                                                if (MBridgeConstans.DEBUG) {
                                                                    th2.printStackTrace();
                                                                }
                                                                H5DownLoadManager.IOnDownLoadH5Source iOnDownLoadH5Source4 = iOnDownLoadH5Source;
                                                                if (iOnDownLoadH5Source4 != null) {
                                                                    try {
                                                                        iOnDownLoadH5Source4.onFailed(th2.getMessage());
                                                                        return;
                                                                    } catch (Exception e6) {
                                                                        e6.printStackTrace();
                                                                        return;
                                                                    }
                                                                }
                                                                return;
                                                            }
                                                        } else if (!z3) {
                                                            iOnDownLoadH5Source2 = iOnDownLoadH5Source;
                                                            if (iOnDownLoadH5Source2 != null) {
                                                                iOnDownLoadH5Source2.onFailed("content write failed:" + message);
                                                            }
                                                        } else {
                                                            iOnDownLoadH5Source2 = iOnDownLoadH5Source;
                                                            if (iOnDownLoadH5Source2 != null) {
                                                                iOnDownLoadH5Source2.onFailed("content write failed:" + message);
                                                            }
                                                        }
                                                    }
                                                } else if (r7 != 0) {
                                                    r7.close();
                                                }
                                                byteArray = bArr;
                                                inputStream = r1;
                                                r6 = r7;
                                                r9 = obj2;
                                            }
                                        } else {
                                            byteArray = null;
                                            str3 = null;
                                        }
                                        message = "";
                                        z2 = true;
                                        r4 = inputStream;
                                        r10 = byteArrayOutputStream;
                                        str2 = str3;
                                    } catch (Exception e7) {
                                        r2 = inputStream;
                                        e = e7;
                                        bArr = null;
                                        byte[] bArr3 = bArr;
                                        obj = bArr3;
                                        r3 = r2;
                                        r8 = bArr3;
                                        ?? r11 = r3;
                                        e = e;
                                        r1 = r11;
                                        r7 = r8;
                                        obj2 = obj;
                                        message = e.getMessage();
                                        C13219q0.m37816b(DownLoadUtils.TAG, "getStringFromUrl failed " + e.getLocalizedMessage());
                                        if (r1 != 0) {
                                            r1.close();
                                            if (r7 != 0) {
                                                r7.close();
                                            }
                                        } else if (r7 != 0) {
                                            r7.close();
                                        }
                                        byteArray = bArr;
                                        inputStream = r1;
                                        r6 = r7;
                                        r9 = obj2;
                                        if (z3) {
                                            if (!z) {
                                                if (!z3) {
                                                    iOnDownLoadH5Source2 = iOnDownLoadH5Source;
                                                    if (iOnDownLoadH5Source2 != null) {
                                                        iOnDownLoadH5Source2.onFailed("content write failed:" + message);
                                                    }
                                                } else {
                                                    iOnDownLoadH5Source2 = iOnDownLoadH5Source;
                                                    if (iOnDownLoadH5Source2 != null) {
                                                        iOnDownLoadH5Source2.onFailed("content write failed:" + message);
                                                    }
                                                }
                                            } else if (!z3) {
                                                iOnDownLoadH5Source2 = iOnDownLoadH5Source;
                                                if (iOnDownLoadH5Source2 != null) {
                                                    iOnDownLoadH5Source2.onFailed("content write failed:" + message);
                                                }
                                            } else {
                                                iOnDownLoadH5Source2 = iOnDownLoadH5Source;
                                                if (iOnDownLoadH5Source2 != null) {
                                                    iOnDownLoadH5Source2.onFailed("content write failed:" + message);
                                                }
                                            }
                                        } else if (!z3) {
                                            iOnDownLoadH5Source2 = iOnDownLoadH5Source;
                                            if (iOnDownLoadH5Source2 != null) {
                                                iOnDownLoadH5Source2.onFailed("content write failed:" + message);
                                            }
                                        } else {
                                            iOnDownLoadH5Source2 = iOnDownLoadH5Source;
                                            if (iOnDownLoadH5Source2 != null) {
                                                iOnDownLoadH5Source2.onFailed("content write failed:" + message);
                                            }
                                        }
                                    } catch (Throwable th3) {
                                        th = th3;
                                        r6 = 0;
                                        r5 = inputStream;
                                        byteArrayOutputStream = r6;
                                        inputStream = r5;
                                        if (inputStream != 0) {
                                            inputStream.close();
                                            if (byteArrayOutputStream != 0) {
                                                byteArrayOutputStream.close();
                                            }
                                        } else if (byteArrayOutputStream != 0) {
                                            byteArrayOutputStream.close();
                                        }
                                        throw th;
                                    }
                                } else {
                                    message = "responseCode is " + responseCode;
                                    r4 = 0;
                                    byteArray = null;
                                    r10 = 0;
                                    str2 = null;
                                    z2 = false;
                                }
                                try {
                                    httpsURLConnection.disconnect();
                                    if (r4 != 0) {
                                        try {
                                            r4.close();
                                        } catch (Exception e8) {
                                            e8.printStackTrace();
                                            message = e8.getMessage();
                                            inputStream = r4;
                                            r6 = r10;
                                            r9 = str2;
                                        }
                                    }
                                    if (r10 != 0) {
                                        r10.close();
                                    }
                                    z3 = z2;
                                    inputStream = r4;
                                    r6 = r10;
                                    r9 = str2;
                                } catch (Exception e9) {
                                    byte[] bArr4 = byteArray;
                                    r3 = r4;
                                    e = e9;
                                    bArr = bArr4;
                                    r8 = r10;
                                    obj = str2;
                                    ?? r12 = r3;
                                    e = e;
                                    r1 = r12;
                                    r7 = r8;
                                    obj2 = obj;
                                    message = e.getMessage();
                                    C13219q0.m37816b(DownLoadUtils.TAG, "getStringFromUrl failed " + e.getLocalizedMessage());
                                    if (r1 != 0) {
                                        r1.close();
                                        if (r7 != 0) {
                                            r7.close();
                                        }
                                    } else if (r7 != 0) {
                                        r7.close();
                                    }
                                    byteArray = bArr;
                                    inputStream = r1;
                                    r6 = r7;
                                    r9 = obj2;
                                }
                            } catch (Throwable th4) {
                                th = th4;
                            }
                        } catch (Exception e10) {
                            e = e10;
                            r2 = 0;
                            bArr = null;
                        } catch (Throwable th5) {
                            th = th5;
                            byteArrayOutputStream = 0;
                            inputStream = r5;
                            if (inputStream != 0) {
                                inputStream.close();
                                if (byteArrayOutputStream != 0) {
                                    byteArrayOutputStream.close();
                                }
                            } else if (byteArrayOutputStream != 0) {
                                byteArrayOutputStream.close();
                            }
                            throw th;
                        }
                        if (z3) {
                            if (!z && byteArray != null && byteArray.length > 0) {
                                iOnDownLoadH5Source.onSuccess(null, byteArray, str);
                            } else if (!z3 && C13182a1.m37597b(r9) && r9.length() > 0 && r9.contains(DownLoadUtils.END_TAG)) {
                                ?? r0 = iOnDownLoadH5Source;
                                if (r0 != 0) {
                                    r0.onSuccess(r9, byteArray, str);
                                }
                            } else {
                                iOnDownLoadH5Source2 = iOnDownLoadH5Source;
                                if (iOnDownLoadH5Source2 != null) {
                                    iOnDownLoadH5Source2.onFailed("content write failed:" + message);
                                }
                            }
                        } else if (!z3) {
                            iOnDownLoadH5Source2 = iOnDownLoadH5Source;
                            if (iOnDownLoadH5Source2 != null) {
                                iOnDownLoadH5Source2.onFailed("content write failed:" + message);
                            }
                        } else {
                            iOnDownLoadH5Source2 = iOnDownLoadH5Source;
                            if (iOnDownLoadH5Source2 != null) {
                                iOnDownLoadH5Source2.onFailed("content write failed:" + message);
                            }
                        }
                    }
                });
                return;
            }
            if (iOnDownLoadH5Source != null) {
                iOnDownLoadH5Source.onFailed("url is error");
            }
        } catch (Throwable th) {
            if (MBridgeConstans.DEBUG) {
                th.printStackTrace();
            }
        }
    }
}
