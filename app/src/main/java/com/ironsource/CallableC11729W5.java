package com.ironsource;

import android.text.TextUtils;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.utils.IronSourceStorageUtils;
import com.ironsource.sdk.utils.Logger;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: com.ironsource.W5 */
/* JADX INFO: loaded from: classes6.dex */
class CallableC11729W5 implements Callable<C12109b5> {

    /* JADX INFO: renamed from: d */
    private static final String f26086d = "FileWorkerThread";

    /* JADX INFO: renamed from: e */
    private static final String f26087e = "X-Android-Protocols";

    /* JADX INFO: renamed from: f */
    private static final String f26088f = "http/1.1,h2";

    /* JADX INFO: renamed from: a */
    private final C11797a5 f26089a;

    /* JADX INFO: renamed from: b */
    private final String f26090b;

    /* JADX INFO: renamed from: c */
    private long f26091c;

    CallableC11729W5(C11797a5 c11797a5, String str, long j) {
        this.f26089a = c11797a5;
        this.f26090b = str;
        this.f26091c = j;
    }

    /* JADX INFO: renamed from: a */
    int m27802a(byte[] bArr, String str) throws Exception {
        return IronSourceStorageUtils.saveFile(bArr, str);
    }

    /* JADX INFO: renamed from: a */
    boolean m27805a(String str, String str2) throws Exception {
        return IronSourceStorageUtils.renameFile(str, str2);
    }

    /* JADX INFO: renamed from: a */
    byte[] m27806a(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[8192];
        while (true) {
            int i = inputStream.read(bArr, 0, 8192);
            if (i != -1) {
                byteArrayOutputStream.write(bArr, 0, i);
            } else {
                byteArrayOutputStream.flush();
                return byteArrayOutputStream.toByteArray();
            }
        }
    }

    @Override // java.util.concurrent.Callable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C12109b5 call() throws Throwable {
        CallableC11729W5 callableC11729W5;
        if (this.f26091c == 0) {
            this.f26091c = 1L;
        }
        C12109b5 c12109b5M27804a = null;
        int i = 0;
        while (true) {
            if (i >= this.f26091c) {
                callableC11729W5 = this;
                break;
            }
            callableC11729W5 = this;
            c12109b5M27804a = callableC11729W5.m27804a(this.f26089a.m28112e(), i, this.f26089a.m28108a(), this.f26089a.m28110c(), this.f26089a.m28113f());
            int iM31135b = c12109b5M27804a.m31135b();
            if (iM31135b != 1008 && iM31135b != 1009) {
                break;
            }
            i++;
        }
        C12109b5 c12109b5 = c12109b5M27804a;
        if (c12109b5 != null && c12109b5.m31134a() != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(callableC11729W5.f26090b);
            String str = File.separator;
            sb.append(str);
            sb.append(callableC11729W5.f26089a.m28109b().getName());
            String string = sb.toString();
            String str2 = callableC11729W5.f26089a.m28111d() + str + C11778Z3.f26660E + callableC11729W5.f26089a.m28109b().getName();
            try {
                if (m27802a(c12109b5.m31134a(), str2) == 0) {
                    c12109b5.m31131a(1006);
                    return c12109b5;
                }
                if (!m27805a(str2, string)) {
                    c12109b5.m31131a(1014);
                    return c12109b5;
                }
            } catch (FileNotFoundException e) {
                C12317m4.m32153d().m32155a(e);
                c12109b5.m31131a(1018);
            } catch (Error e2) {
                C12317m4.m32153d().m32155a(e2);
                if (!TextUtils.isEmpty(e2.getMessage())) {
                    Logger.m33642i(f26086d, e2.getMessage());
                }
                c12109b5.m31131a(1019);
            } catch (Exception e3) {
                C12317m4.m32153d().m32155a(e3);
                if (!TextUtils.isEmpty(e3.getMessage())) {
                    Logger.m33642i(f26086d, e3.getMessage());
                }
                c12109b5.m31131a(1009);
            }
        }
        return c12109b5;
    }

    /* JADX WARN: Code duplicated, block: B:111:0x0183 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:112:0x0185 A[Catch: all -> 0x0181, TRY_LEAVE, TryCatch #0 {all -> 0x0181, blocks: (B:108:0x017d, B:112:0x0185), top: B:117:0x017d }] */
    /* JADX WARN: Code duplicated, block: B:117:0x017d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    C12109b5 m27804a(String str, int i, int i2, int i3, boolean z) throws Throwable {
        HttpURLConnection httpURLConnection;
        C12109b5 c12109b5 = new C12109b5();
        if (TextUtils.isEmpty(str)) {
            c12109b5.m31132a(str);
            c12109b5.m31131a(1007);
            return c12109b5;
        }
        InputStream inputStream = null;
        Object[] objArr = 0;
        InputStream inputStream2 = null;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object[] objArr5 = 0;
        Object[] objArr6 = 0;
        Object[] objArr7 = 0;
        int responseCode = 0;
        try {
            try {
                try {
                    try {
                        URL url = new URL(str);
                        url.toURI();
                        httpURLConnection = (HttpURLConnection) url.openConnection();
                        try {
                            httpURLConnection.setRequestMethod("GET");
                            if (z) {
                                try {
                                    httpURLConnection.setRequestProperty(f26087e, f26088f);
                                } catch (IllegalStateException e) {
                                    C12317m4.m32153d().m32155a(e);
                                }
                            }
                            httpURLConnection.setConnectTimeout(i2);
                            httpURLConnection.setReadTimeout(i3);
                            httpURLConnection.connect();
                            responseCode = httpURLConnection.getResponseCode();
                            if (responseCode >= 200 && responseCode < 400) {
                                inputStream2 = httpURLConnection.getInputStream();
                                c12109b5.m31133a(m27806a(inputStream2));
                            } else {
                                Logger.m33642i(f26086d, " RESPONSE CODE: " + responseCode + " URL: " + str + " ATTEMPT: " + i);
                                responseCode = 1011;
                            }
                            if (inputStream2 != null) {
                                inputStream2.close();
                            }
                            httpURLConnection.disconnect();
                        } catch (FileNotFoundException e2) {
                            e = e2;
                            C12317m4.m32153d().m32155a(e);
                            i = 1018;
                            if (0 != 0) {
                                (objArr2 == true ? 1 : 0).close();
                            }
                            if (httpURLConnection != null) {
                                httpURLConnection.disconnect();
                            }
                            c12109b5.m31132a(str);
                            c12109b5.m31131a(i);
                            return c12109b5;
                        } catch (Error e3) {
                            e = e3;
                            C12317m4.m32153d().m32155a(e);
                            responseCode = 1019;
                            if (!TextUtils.isEmpty(e.getMessage())) {
                                Logger.m33642i(f26086d, e.getMessage());
                            }
                            if (0 != 0) {
                                (objArr3 == true ? 1 : 0).close();
                            }
                            if (httpURLConnection != null) {
                                httpURLConnection.disconnect();
                            }
                        } catch (MalformedURLException e4) {
                            e = e4;
                            C12317m4.m32153d().m32155a(e);
                            i = 1004;
                            if (0 != 0) {
                                (objArr4 == true ? 1 : 0).close();
                            }
                            if (httpURLConnection != null) {
                                httpURLConnection.disconnect();
                            }
                            c12109b5.m31132a(str);
                            c12109b5.m31131a(i);
                            return c12109b5;
                        } catch (SocketTimeoutException e5) {
                            e = e5;
                            C12317m4.m32153d().m32155a(e);
                            i = 1008;
                            if (0 != 0) {
                                (objArr5 == true ? 1 : 0).close();
                            }
                            if (httpURLConnection != null) {
                                httpURLConnection.disconnect();
                            }
                            c12109b5.m31132a(str);
                            c12109b5.m31131a(i);
                            return c12109b5;
                        } catch (URISyntaxException e6) {
                            e = e6;
                            C12317m4.m32153d().m32155a(e);
                            i = 1010;
                            if (0 != 0) {
                                (objArr6 == true ? 1 : 0).close();
                            }
                            if (httpURLConnection != null) {
                                httpURLConnection.disconnect();
                            }
                            c12109b5.m31132a(str);
                            c12109b5.m31131a(i);
                            return c12109b5;
                        } catch (Exception e7) {
                            e = e7;
                            C12317m4.m32153d().m32155a(e);
                            if (!TextUtils.isEmpty(e.getMessage())) {
                                Logger.m33642i(f26086d, e.getMessage());
                            }
                            i = 1009;
                            if (0 != 0) {
                                (objArr7 == true ? 1 : 0).close();
                            }
                            if (httpURLConnection != null) {
                                httpURLConnection.disconnect();
                            }
                            c12109b5.m31132a(str);
                            c12109b5.m31131a(i);
                            return c12109b5;
                        }
                    } catch (Throwable th) {
                        C12317m4.m32153d().m32155a(th);
                        IronLog.INTERNAL.error(th.toString());
                        c12109b5.m31132a(str);
                        c12109b5.m31131a(i);
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (0 != 0) {
                        try {
                            inputStream.close();
                            if (0 != 0) {
                                (objArr == true ? 1 : 0).disconnect();
                            }
                        } catch (Throwable th3) {
                            C12317m4.m32153d().m32155a(th3);
                            IronLog.INTERNAL.error(th3.toString());
                            c12109b5.m31132a(str);
                            c12109b5.m31131a(0);
                            throw th;
                        }
                    } else if (0 != 0) {
                        (objArr == true ? 1 : 0).disconnect();
                    }
                    c12109b5.m31132a(str);
                    c12109b5.m31131a(0);
                    throw th;
                }
            } catch (FileNotFoundException e8) {
                e = e8;
                httpURLConnection = null;
            } catch (Error e9) {
                e = e9;
                httpURLConnection = null;
            } catch (MalformedURLException e10) {
                e = e10;
                httpURLConnection = null;
            } catch (SocketTimeoutException e11) {
                e = e11;
                httpURLConnection = null;
            } catch (URISyntaxException e12) {
                e = e12;
                httpURLConnection = null;
            } catch (Exception e13) {
                e = e13;
                httpURLConnection = null;
            } catch (Throwable th4) {
                th = th4;
                if (0 != 0) {
                    inputStream.close();
                    if (0 != 0) {
                        (objArr == true ? 1 : 0).disconnect();
                    }
                } else if (0 != 0) {
                    (objArr == true ? 1 : 0).disconnect();
                }
                c12109b5.m31132a(str);
                c12109b5.m31131a(0);
                throw th;
            }
        } catch (Throwable th5) {
            C12317m4.m32153d().m32155a(th5);
            IronLog.INTERNAL.error(th5.toString());
        }
        c12109b5.m31132a(str);
        c12109b5.m31131a(responseCode);
        return c12109b5;
    }
}
