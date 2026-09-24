package com.mbridge.msdk.config.component.common.network.connect.socket;

import android.text.TextUtils;
import com.facebook.internal.security.CertificateUtil;
import com.mbridge.msdk.config.component.common.network.InterfaceC12757a;
import com.mbridge.msdk.config.component.common.network.listener.EventListenerTCP;
import com.mbridge.msdk.config.component.common.network.result.C12764a;
import com.mbridge.msdk.config.component.common.network.retry.C12767c;
import com.mbridge.msdk.config.component.common.network.retry.InterfaceC12765a;
import com.mbridge.msdk.config.component.common.util.C12770c;
import com.mbridge.msdk.config.component.nori.model.C12831a;
import com.mbridge.msdk.foundation.same.net.utils.C13121d;
import com.mbridge.msdk.foundation.tools.C13219q0;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ConnectException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.mbridge.msdk.config.component.common.network.connect.socket.b */
/* JADX INFO: compiled from: SocketRequestTask.java */
/* JADX INFO: loaded from: classes5.dex */
public class RunnableC12762b implements Runnable {

    /* JADX INFO: renamed from: a */
    private String f33956a;

    /* JADX INFO: renamed from: b */
    private final AtomicInteger f33957b = new AtomicInteger(1);

    /* JADX INFO: renamed from: c */
    private boolean f33958c = false;

    /* JADX INFO: renamed from: d */
    private Socket f33959d;

    /* JADX INFO: renamed from: e */
    private OutputStream f33960e;

    /* JADX INFO: renamed from: f */
    private InputStream f33961f;

    /* JADX INFO: renamed from: g */
    private C12831a f33962g;

    /* JADX INFO: renamed from: h */
    private C12764a f33963h;

    /* JADX INFO: renamed from: i */
    private InterfaceC12757a f33964i;

    /* JADX INFO: renamed from: j */
    private InterfaceC12765a f33965j;

    /* JADX INFO: renamed from: k */
    private EventListenerTCP f33966k;

    /* JADX INFO: renamed from: l */
    private boolean f33967l;

    /* JADX INFO: renamed from: m */
    private String f33968m;

    public RunnableC12762b(C12831a c12831a, C12764a c12764a, InterfaceC12757a interfaceC12757a) {
        this.f33962g = c12831a;
        this.f33964i = interfaceC12757a;
        this.f33963h = c12764a;
        this.f33966k = new EventListenerTCP(c12764a.m35157b());
    }

    /* JADX INFO: renamed from: b */
    private void m35134b(String str) throws IOException {
        byte[] bArrM35132a;
        try {
            EventListenerTCP eventListenerTCP = this.f33966k;
            if (eventListenerTCP != null) {
                eventListenerTCP.requestHeadersStart();
            }
            this.f33967l = false;
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[8]);
            byteBufferWrap.order(ByteOrder.BIG_ENDIAN);
            byteBufferWrap.put((byte) 2);
            if (TextUtils.isEmpty(str)) {
                byteBufferWrap.put((byte) 1);
            } else {
                byteBufferWrap.put(this.f33967l ? (byte) 3 : (byte) 2);
            }
            byteBufferWrap.putShort((short) this.f33957b.getAndIncrement());
            if (TextUtils.isEmpty(str)) {
                byteBufferWrap.putInt(0);
                bArrM35132a = null;
            } else {
                bArrM35132a = this.f33967l ? m35132a(str) : str.getBytes();
                byteBufferWrap.putInt(bArrM35132a != null ? bArrM35132a.length : 0);
            }
            this.f33960e.write(byteBufferWrap.array());
            EventListenerTCP eventListenerTCP2 = this.f33966k;
            if (eventListenerTCP2 != null) {
                eventListenerTCP2.requestHeadersEnd();
            }
            if (bArrM35132a != null) {
                EventListenerTCP eventListenerTCP3 = this.f33966k;
                if (eventListenerTCP3 != null) {
                    eventListenerTCP3.requestBodyStart();
                }
                this.f33960e.write(bArrM35132a);
                EventListenerTCP eventListenerTCP4 = this.f33966k;
                if (eventListenerTCP4 != null) {
                    eventListenerTCP4.requestBodyEnd(bArrM35132a.length);
                }
            }
            this.f33960e.flush();
        } catch (IOException e) {
            C13219q0.m37816b("JavaSocketConnection", "Failed to send request: " + e.getMessage());
            throw new IOException("Failed to send request: " + e.getMessage(), e);
        }
    }

    /* JADX INFO: renamed from: d */
    private C12764a m35136d() {
        try {
            JSONObject jSONObjectM35138g = m35138g();
            m35137f();
            m35134b(jSONObjectM35138g.toString());
            return m35140i();
        } catch (ConnectException e) {
            return m35130a(1002, 1002, "Connection refused: " + e.getMessage());
        } catch (SocketTimeoutException e2) {
            return m35130a(1001, 1001, "Connection timeout: " + e2.getMessage());
        } catch (UnknownHostException e3) {
            return m35130a(2001, 2001, "Host unreachable: " + e3.getMessage());
        } catch (IOException e4) {
            return m35130a(2003, 2003, "Network error: " + e4.getMessage());
        } catch (Exception e5) {
            return m35130a(1999, 1999, "Unknown error: " + e5.getMessage());
        }
    }

    /* JADX INFO: renamed from: f */
    private void m35137f() throws IOException {
        try {
            try {
                try {
                    try {
                        EventListenerTCP eventListenerTCP = this.f33966k;
                        if (eventListenerTCP != null) {
                            eventListenerTCP.dnsStart();
                        }
                        this.f33959d = new Socket();
                        InetSocketAddress inetSocketAddress = new InetSocketAddress(this.f33956a, this.f33962g.m35641j());
                        if (inetSocketAddress.isUnresolved()) {
                            throw new IOException("Cannot resolve host: " + this.f33956a);
                        }
                        EventListenerTCP eventListenerTCP2 = this.f33966k;
                        if (eventListenerTCP2 != null) {
                            eventListenerTCP2.dnsEnd(this.f33956a, Arrays.asList(inetSocketAddress.getAddress()));
                        }
                        this.f33959d.setSoTimeout(30000);
                        EventListenerTCP eventListenerTCP3 = this.f33966k;
                        if (eventListenerTCP3 != null) {
                            eventListenerTCP3.connectStart(inetSocketAddress);
                        }
                        this.f33959d.connect(inetSocketAddress, 30000);
                        EventListenerTCP eventListenerTCP4 = this.f33966k;
                        if (eventListenerTCP4 != null) {
                            eventListenerTCP4.connectEnd(inetSocketAddress);
                        }
                        this.f33960e = this.f33959d.getOutputStream();
                        this.f33961f = this.f33959d.getInputStream();
                        C13219q0.m37813a("JavaSocketConnection", "Socket connected to " + this.f33956a + CertificateUtil.DELIMITER);
                        Socket socket = this.f33959d;
                        if (socket == null || !socket.isConnected()) {
                            m35133b();
                        }
                    } catch (UnknownHostException e) {
                        EventListenerTCP eventListenerTCP5 = this.f33966k;
                        if (eventListenerTCP5 != null) {
                            eventListenerTCP5.connectFailed(new InetSocketAddress(this.f33956a, this.f33962g.m35641j()), e);
                        }
                        throw new IOException("Host unreachable", e);
                    }
                } catch (SocketTimeoutException e2) {
                    EventListenerTCP eventListenerTCP6 = this.f33966k;
                    if (eventListenerTCP6 != null) {
                        eventListenerTCP6.connectFailed(new InetSocketAddress(this.f33956a, this.f33962g.m35641j()), e2);
                    }
                    throw new IOException("Connection timeout", e2);
                }
            } catch (ConnectException e3) {
                EventListenerTCP eventListenerTCP7 = this.f33966k;
                if (eventListenerTCP7 != null) {
                    eventListenerTCP7.connectFailed(new InetSocketAddress(this.f33956a, this.f33962g.m35641j()), e3);
                }
                throw new IOException("Connection refused", e3);
            } catch (IOException e4) {
                EventListenerTCP eventListenerTCP8 = this.f33966k;
                if (eventListenerTCP8 != null) {
                    eventListenerTCP8.connectFailed(new InetSocketAddress(this.f33956a, this.f33962g.m35641j()), e4);
                }
                throw new IOException("Connection failed", e4);
            }
        } catch (Throwable th) {
            Socket socket2 = this.f33959d;
            if (socket2 == null || !socket2.isConnected()) {
                m35133b();
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: g */
    private JSONObject m35138g() {
        JSONObject jSONObject = new JSONObject();
        try {
            this.f33956a = C13121d.m37226h().f36036m;
            int iM35641j = this.f33962g.m35641j();
            Map<String, Object> mapM35625b = this.f33962g.m35625b();
            JSONObject jSONObject2 = new JSONObject();
            if (mapM35625b != null) {
                for (Map.Entry<String, Object> entry : mapM35625b.entrySet()) {
                    jSONObject2.put(entry.getKey(), entry.getValue());
                }
            }
            jSONObject.put("headers", jSONObject2);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("host", this.f33956a);
            jSONObject3.put("port", iM35641j);
            Map<String, Object> mapM35619a = this.f33962g.m35619a();
            if (mapM35619a != null) {
                JSONObject jSONObject4 = new JSONObject();
                for (Map.Entry<String, Object> entry2 : mapM35619a.entrySet()) {
                    jSONObject4.put(entry2.getKey(), entry2.getValue());
                }
                jSONObject3.put("data", jSONObject4);
            }
            jSONObject.put("body", jSONObject3);
            return jSONObject;
        } catch (Exception e) {
            C13219q0.m37816b("JavaSocketConnection", "Failed to prepare request content: " + e.getMessage());
            return jSONObject;
        }
    }

    /* JADX INFO: renamed from: h */
    private void m35139h() {
        if (this.f33964i == null) {
            return;
        }
        EventListenerTCP eventListenerTCP = this.f33966k;
        if (eventListenerTCP != null) {
            eventListenerTCP.callEnd();
        }
        if (C12770c.m35208a(this.f33963h.m35165g())) {
            this.f33964i.mo35102b(this.f33963h);
            return;
        }
        if (this.f33963h.m35165g() == 200) {
            this.f33964i.mo35103c(this.f33963h);
            InterfaceC12765a interfaceC12765a = this.f33965j;
            if (interfaceC12765a != null) {
                interfaceC12765a.mo35167a();
                return;
            }
            return;
        }
        InterfaceC12765a interfaceC12765a2 = this.f33965j;
        if (interfaceC12765a2 != null) {
            interfaceC12765a2.mo35168b();
        } else if (this.f33962g.m35638g() > 0) {
            new C12767c(this.f33968m, this.f33962g, this.f33964i, this.f33963h).m35181c();
        } else {
            this.f33964i.mo35104d(this.f33963h);
        }
    }

    /* JADX INFO: renamed from: i */
    private C12764a m35140i() {
        try {
            EventListenerTCP eventListenerTCP = this.f33966k;
            if (eventListenerTCP != null) {
                eventListenerTCP.responseHeadersStart();
            }
            byte[] bArr = new byte[8];
            if (this.f33961f.read(bArr) != 8) {
                return m35130a(1008, 1008, "Failed to read response header");
            }
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
            byteBufferWrap.order(ByteOrder.BIG_ENDIAN);
            if (byteBufferWrap.get() != 2) {
                return m35130a(1008, 1008, "Invalid protocol version");
            }
            byte b = byteBufferWrap.get();
            byteBufferWrap.getShort();
            int i = byteBufferWrap.getInt();
            EventListenerTCP eventListenerTCP2 = this.f33966k;
            if (eventListenerTCP2 != null) {
                eventListenerTCP2.responseHeadersEnd();
            }
            if (i > 0) {
                EventListenerTCP eventListenerTCP3 = this.f33966k;
                if (eventListenerTCP3 != null) {
                    eventListenerTCP3.responseBodyStart();
                }
                boolean z = false;
                boolean z2 = b == 3;
                byte[] bArr2 = new byte[i];
                new DataInputStream(this.f33961f).readFully(bArr2);
                if (i > 2) {
                    if (((bArr2[0] << 8) | (bArr2[1] & 255)) == 8075) {
                        z = true;
                    }
                }
                try {
                    this.f33963h.m35159b((z2 && z) ? m35131a(bArr2) : new String(bArr2));
                    this.f33963h.m35161c(200);
                    this.f33963h.m35158b(1);
                    EventListenerTCP eventListenerTCP4 = this.f33966k;
                    if (eventListenerTCP4 != null) {
                        eventListenerTCP4.responseBodyEnd(i);
                    }
                } catch (Exception e) {
                    return m35130a(1010, 1010, "Failed to process response data: " + e.getMessage());
                }
            } else {
                this.f33963h.m35161c(200);
                this.f33963h.m35158b(1);
            }
            return this.f33963h;
        } catch (SocketTimeoutException e2) {
            return m35130a(1004, 1004, "Read timeout: " + e2.getMessage());
        } catch (IOException e3) {
            return m35130a(1006, 1006, "Failed to read response: " + e3.getMessage());
        } catch (Exception e4) {
            return m35130a(1999, 1999, "Unknown error while processing response: " + e4.getMessage());
        }
    }

    /* JADX INFO: renamed from: a */
    public void m35142a(InterfaceC12765a interfaceC12765a) {
        this.f33965j = interfaceC12765a;
    }

    /* JADX INFO: renamed from: c */
    public void m35143c(String str) {
        this.f33968m = str;
    }

    /* JADX INFO: renamed from: e */
    public EventListenerTCP m35144e() {
        return this.f33966k;
    }

    @Override // java.lang.Runnable
    public void run() {
        m35135c();
    }

    /* JADX INFO: renamed from: c */
    private void m35135c() {
        this.f33963h = m35136d();
        if (this.f33958c) {
            m35130a(1999, 1999, "Request cancelled");
        }
        m35139h();
    }

    /* JADX INFO: renamed from: a */
    public void m35141a() {
        this.f33958c = true;
        m35133b();
    }

    /* JADX INFO: renamed from: a */
    private byte[] m35132a(String str) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
        gZIPOutputStream.write(str.getBytes());
        gZIPOutputStream.close();
        return byteArrayOutputStream.toByteArray();
    }

    /* JADX INFO: renamed from: a */
    private String m35131a(byte[] bArr) throws IOException {
        if (bArr != null && bArr.length != 0) {
            try {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
                GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                byte[] bArr2 = new byte[1024];
                while (true) {
                    int i = gZIPInputStream.read(bArr2);
                    if (i > 0) {
                        byteArrayOutputStream.write(bArr2, 0, i);
                    } else {
                        gZIPInputStream.close();
                        byteArrayInputStream.close();
                        byteArrayOutputStream.close();
                        return byteArrayOutputStream.toString();
                    }
                }
            } catch (IOException e) {
                C13219q0.m37816b("JavaSocketConnection", "Failed to decompress GZIP data: " + e.getMessage());
                throw e;
            }
        } else {
            return "";
        }
    }

    /* JADX INFO: renamed from: a */
    private C12764a m35130a(int i, int i2, String str) {
        this.f33963h.m35155a(str);
        this.f33963h.m35161c(i);
        this.f33963h.m35152a(i2);
        this.f33963h.m35158b(2);
        EventListenerTCP eventListenerTCP = this.f33966k;
        if (eventListenerTCP != null) {
            eventListenerTCP.callFailed(new IOException(str));
        }
        return this.f33963h;
    }

    /* JADX INFO: renamed from: b */
    private void m35133b() {
        OutputStream outputStream = this.f33960e;
        try {
            if (outputStream != null) {
                try {
                    outputStream.close();
                } catch (IOException e) {
                    C13219q0.m37816b("JavaSocketConnection", "Error closing output stream: " + e.getMessage());
                }
                this.f33960e = null;
            }
            InputStream inputStream = this.f33961f;
            if (inputStream != null) {
                try {
                    try {
                        inputStream.close();
                    } catch (IOException e2) {
                        C13219q0.m37816b("JavaSocketConnection", "Error closing input stream: " + e2.getMessage());
                    }
                    this.f33961f = null;
                } catch (Throwable th) {
                    this.f33961f = null;
                    throw th;
                }
            }
            Socket socket = this.f33959d;
            try {
                if (socket != null) {
                    try {
                        socket.close();
                    } catch (IOException e3) {
                        C13219q0.m37816b("JavaSocketConnection", "Error closing socket: " + e3.getMessage());
                    }
                    this.f33959d = null;
                }
                C13219q0.m37813a("JavaSocketConnection", "All resources closed");
            } catch (Throwable th2) {
                this.f33959d = null;
                throw th2;
            }
        } catch (Throwable th3) {
            this.f33960e = null;
            throw th3;
        }
    }
}
