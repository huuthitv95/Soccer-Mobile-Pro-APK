package com.bytedance.sdk.component.p160lr.p161ri.p163ri.p164ri;

import android.text.TextUtils;
import com.bytedance.sdk.component.p160lr.p161ri.AbstractC2646co;
import com.bytedance.sdk.component.p160lr.p161ri.AbstractC2650ka;
import com.bytedance.sdk.component.p160lr.p161ri.C2645aw;
import com.bytedance.sdk.component.p160lr.p161ri.InterfaceC2649ik;
import com.bytedance.sdk.component.p160lr.p161ri.InterfaceC2651lr;
import com.bytedance.sdk.component.p160lr.p161ri.InterfaceC2659mj;
import com.bytedance.sdk.component.p160lr.p161ri.bgr;
import com.bytedance.sdk.component.p165mj.p166lr.AbstractRunnableC2676ik;
import com.bytedance.sdk.component.xha.C2744ri;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.reflect.Field;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.bytedance.sdk.component.lr.ri.ri.ri.lr */
/* JADX INFO: loaded from: classes3.dex */
public class C2667lr implements InterfaceC2651lr {

    /* JADX INFO: renamed from: ka */
    private static List<Object> f7586ka;

    /* JADX INFO: renamed from: ik */
    private AtomicBoolean f7587ik = new AtomicBoolean(false);

    /* JADX INFO: renamed from: lr */
    AbstractC2650ka f7588lr;

    /* JADX INFO: renamed from: ri */
    AbstractC2646co f7589ri;

    static {
        try {
            f7586ka = new ArrayList();
            Class<?> cls = Class.forName("com.android.okhttp.Protocol");
            Enum enumValueOf = Enum.valueOf(cls, "HTTP_1_1");
            if (enumValueOf != null) {
                f7586ka.add(enumValueOf);
            }
            Enum enumValueOf2 = Enum.valueOf(cls, "HTTP_2");
            if (enumValueOf2 != null) {
                f7586ka.add(enumValueOf2);
            }
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    C2667lr(AbstractC2646co abstractC2646co, AbstractC2650ka abstractC2650ka) {
        this.f7589ri = abstractC2646co;
        this.f7588lr = abstractC2650ka;
    }

    /* JADX INFO: renamed from: fi */
    private boolean m9988fi() {
        if (this.f7589ri.mo9883di() == null) {
            return false;
        }
        return this.f7589ri.mo9883di().containsKey("Content-Type");
    }

    /* JADX INFO: renamed from: ik */
    private static void m9989ik(HttpURLConnection httpURLConnection) {
        try {
            Field declaredField = httpURLConnection.getClass().getDeclaredField("delegate");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(httpURLConnection);
            Field declaredField2 = obj.getClass().getDeclaredField("client");
            declaredField2.setAccessible(true);
            Object obj2 = declaredField2.get(obj);
            obj2.getClass().getDeclaredMethod("setRetryOnConnectionFailure", Boolean.TYPE).invoke(obj2, Boolean.FALSE);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: lr */
    private bgr m9990lr(AbstractC2646co abstractC2646co, boolean z) throws IOException {
        HttpURLConnection httpURLConnection;
        IOException e;
        String strM9995ri;
        int i = C2668mj.f7594ri;
        HttpURLConnection httpURLConnection2 = null;
        try {
            httpURLConnection = (HttpURLConnection) new URL(abstractC2646co.mo9886ka().m10030ri().toString()).openConnection();
            if (z) {
                try {
                    if (!"setting".equals(abstractC2646co.mo9888mj()) && !"gecko".equals(abstractC2646co.mo9888mj()) && !"load_ug_t".equals(abstractC2646co.mo9888mj())) {
                        m9991lr(httpURLConnection);
                    }
                } catch (IOException e2) {
                    e = e2;
                    if (i == -1 && z) {
                        abstractC2646co.mo9886ka().m10030ri().toString();
                        return m9990lr(abstractC2646co, false);
                    }
                    strM9995ri = m9995ri(httpURLConnection, e);
                } catch (Exception e3) {
                    e = e3;
                    httpURLConnection2 = httpURLConnection;
                    strM9995ri = m9995ri(httpURLConnection2, e);
                }
            }
            if (abstractC2646co.mo9883di() != null && !abstractC2646co.mo9883di().isEmpty()) {
                for (Map.Entry<String, List<String>> entry : abstractC2646co.mo9883di().entrySet()) {
                    String key = entry.getKey();
                    for (String str : entry.getValue()) {
                        if ("_disable_retry".equals(key) && "1".equals(str)) {
                            m9989ik(httpURLConnection);
                        } else {
                            httpURLConnection.addRequestProperty(key, str);
                        }
                    }
                }
            }
            if (abstractC2646co.f7530ri != null) {
                if (abstractC2646co.f7530ri.f7607ik != null) {
                    httpURLConnection.setConnectTimeout((int) abstractC2646co.f7530ri.f7607ik.toMillis(abstractC2646co.f7530ri.f7609lr));
                }
                if (abstractC2646co.f7530ri.f7606fi != null) {
                    httpURLConnection.setReadTimeout((int) abstractC2646co.f7530ri.f7606fi.toMillis(abstractC2646co.f7530ri.f7608ka));
                }
            }
            if (abstractC2646co.mo9889qt() == null) {
                httpURLConnection.setRequestMethod("GET");
            } else {
                if (!m9988fi() && abstractC2646co.mo9889qt().f7522ik != null) {
                    httpURLConnection.addRequestProperty("Content-Type", abstractC2646co.mo9889qt().f7522ik.m9915ri());
                }
                httpURLConnection.setRequestMethod(abstractC2646co.mo9884fi());
                if ("POST".equalsIgnoreCase(abstractC2646co.mo9884fi())) {
                    OutputStream outputStream = httpURLConnection.getOutputStream();
                    if (m9997ri(abstractC2646co.mo9889qt())) {
                        outputStream.write(abstractC2646co.mo9889qt().f7521fi);
                    } else if (m9992lr(abstractC2646co.mo9889qt())) {
                        outputStream.write(abstractC2646co.mo9889qt().f7523ka.getBytes());
                    }
                    outputStream.flush();
                    outputStream.close();
                }
            }
            if (abstractC2646co.f7529lr != null) {
                abstractC2646co.f7529lr.m9753lr();
            }
            httpURLConnection.connect();
            if (abstractC2646co.f7529lr != null) {
                abstractC2646co.f7529lr.m9751ik();
            }
            int responseCode = httpURLConnection.getResponseCode();
            if (abstractC2646co.f7529lr != null) {
                abstractC2646co.f7529lr.m9750fi();
            }
            if (!this.f7587ik.get()) {
                return new C2668mj(httpURLConnection, abstractC2646co, responseCode);
            }
            i = C2668mj.f7593lr;
            m9996ri(httpURLConnection);
            strM9995ri = "internal error";
            return new C2668mj(i, strM9995ri, abstractC2646co);
        } catch (IOException e4) {
            httpURLConnection = null;
            e = e4;
        } catch (Exception e5) {
            e = e5;
        }
    }

    /* JADX INFO: renamed from: lr */
    private static void m9991lr(HttpURLConnection httpURLConnection) {
        try {
            Field declaredField = httpURLConnection.getClass().getDeclaredField("delegate");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(httpURLConnection);
            Field declaredField2 = obj.getClass().getDeclaredField("client");
            declaredField2.setAccessible(true);
            Object obj2 = declaredField2.get(obj);
            if (f7586ka.size() == 2) {
                obj2.getClass().getDeclaredMethod("setProtocols", List.class).invoke(obj2, f7586ka);
            }
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    /* JADX INFO: renamed from: lr */
    private boolean m9992lr(C2645aw c2645aw) {
        AbstractC2646co abstractC2646co;
        return (c2645aw == null || (abstractC2646co = this.f7589ri) == null || !"POST".equalsIgnoreCase(abstractC2646co.mo9884fi()) || c2645aw.f7520di != C2645aw.ri.STRING_TYPE || TextUtils.isEmpty(c2645aw.f7523ka)) ? false : true;
    }

    /* JADX INFO: renamed from: ri */
    private bgr m9993ri(AbstractC2646co abstractC2646co, List<String> list) throws IOException {
        long jCurrentTimeMillis = System.currentTimeMillis();
        ArrayList arrayList = new ArrayList(list.size() + 1);
        String string = abstractC2646co.mo9886ka().m10030ri().toString();
        arrayList.add(string);
        for (String str : list) {
            if (str != null && !str.equals(string)) {
                arrayList.add(str);
            }
        }
        long jMo9887lr = abstractC2646co.mo9887lr();
        int size = arrayList.size();
        bgr bgrVar = null;
        int i = 0;
        while (i < size) {
            String str2 = (String) arrayList.get(i);
            if (System.currentTimeMillis() - jCurrentTimeMillis > jMo9887lr) {
                if (bgrVar == null) {
                    return new C2668mj(-1, "Total timeout", abstractC2646co, str2);
                }
                return bgrVar;
            }
            if (this.f7587ik.get()) {
                return new C2668mj(C2668mj.f7593lr, "Request canceled", abstractC2646co, str2);
            }
            try {
                arrayList.size();
                toString();
                bgr bgrVarM9990lr = m9990lr(i == 0 ? abstractC2646co : m9994ri(abstractC2646co, str2), C2744ri.m10406fi());
                if (bgrVarM9990lr instanceof C2668mj) {
                    ((C2668mj) bgrVarM9990lr).m10002ri(str2);
                }
                try {
                    if (bgrVarM9990lr.mo9879ka()) {
                        toString();
                    } else if (i == arrayList.size() - 1) {
                        bgrVarM9990lr.mo9878ik();
                    } else {
                        bgrVar = bgrVarM9990lr;
                        i++;
                    }
                    return bgrVarM9990lr;
                } catch (IOException e) {
                    e = e;
                    bgrVar = bgrVarM9990lr;
                    e.getMessage();
                    if (i == arrayList.size() - 1) {
                        e.getMessage();
                    }
                }
            } catch (IOException e2) {
                e = e2;
            }
        }
        if (bgrVar == null) {
            return new C2668mj(C2668mj.f7594ri, "No URLs to try", abstractC2646co, (String) arrayList.get(arrayList.size() - 1));
        }
        return bgrVar;
    }

    /* JADX INFO: renamed from: ri */
    private AbstractC2646co m9994ri(AbstractC2646co abstractC2646co, String str) {
        return abstractC2646co.m9892sf().m9896lr(str).m9898lr();
    }

    /* JADX INFO: renamed from: ri */
    private static String m9995ri(HttpURLConnection httpURLConnection, Exception exc) {
        try {
            return httpURLConnection.getErrorStream().toString();
        } catch (Throwable unused) {
            return exc.getMessage();
        }
    }

    /* JADX INFO: renamed from: ri */
    private void m9996ri(HttpURLConnection httpURLConnection) {
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e) {
                e.getMessage();
            }
        }
    }

    /* JADX INFO: renamed from: ri */
    private boolean m9997ri(C2645aw c2645aw) {
        AbstractC2646co abstractC2646co;
        return c2645aw != null && (abstractC2646co = this.f7589ri) != null && "POST".equalsIgnoreCase(abstractC2646co.mo9884fi()) && c2645aw.f7520di == C2645aw.ri.BYTE_ARRAY_TYPE && c2645aw.f7521fi != null && c2645aw.f7521fi.length > 0;
    }

    @Override // com.bytedance.sdk.component.p160lr.p161ri.InterfaceC2651lr
    /* JADX INFO: renamed from: ik */
    public void mo9922ik() {
        this.f7587ik.set(true);
    }

    /* JADX INFO: renamed from: ka, reason: merged with bridge method [inline-methods] */
    public InterfaceC2651lr clone() {
        return new C2667lr(this.f7589ri, this.f7588lr);
    }

    @Override // com.bytedance.sdk.component.p160lr.p161ri.InterfaceC2651lr
    /* JADX INFO: renamed from: lr */
    public bgr mo9923lr() throws IOException {
        AbstractC2646co abstractC2646co = this.f7589ri;
        if (abstractC2646co != null && abstractC2646co.f7529lr != null) {
            if (this.f7589ri.f7529lr.bgr() == 0) {
                this.f7589ri.f7529lr.m9758vr();
            }
            this.f7589ri.f7529lr.m9756ri();
        }
        this.f7588lr.mo9917ik().remove(this);
        this.f7588lr.mo9918ka().add(this);
        AbstractC2650ka abstractC2650ka = this.f7588lr;
        if ((abstractC2650ka instanceof C2663di) && (abstractC2650ka.mo9917ik().size() + this.f7588lr.mo9918ka().size() > this.f7588lr.mo9920ri() || this.f7587ik.get())) {
            this.f7588lr.mo9918ka().remove(this);
            return new C2668mj(C2668mj.f7594ri, "Maximum number of requests exceeded", this.f7589ri);
        }
        try {
            if (this.f7589ri.f7530ri == null || this.f7589ri.f7530ri.f7610ri == null || this.f7589ri.f7530ri.f7610ri.size() <= 0) {
                bgr bgrVarM9999ri = m9999ri(this.f7589ri);
                this.f7588lr.mo9918ka().remove(this);
                return bgrVarM9999ri;
            }
            ArrayList arrayList = new ArrayList(this.f7589ri.f7530ri.f7610ri);
            arrayList.add(new InterfaceC2659mj() { // from class: com.bytedance.sdk.component.lr.ri.ri.ri.lr.1
                @Override // com.bytedance.sdk.component.p160lr.p161ri.InterfaceC2659mj
                /* JADX INFO: renamed from: ri */
                public bgr mo9974ri(InterfaceC2659mj.ri riVar) throws IOException {
                    return C2667lr.this.m9999ri(riVar.mo9976ri());
                }
            });
            bgr bgrVarMo9974ri = ((InterfaceC2659mj) arrayList.get(0)).mo9974ri(new C2665ik(arrayList, this.f7589ri));
            this.f7588lr.mo9918ka().remove(this);
            return bgrVarMo9974ri;
        } catch (Throwable th) {
            try {
                throw new IOException(th.getMessage());
            } catch (Throwable th2) {
                this.f7588lr.mo9918ka().remove(this);
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: ri */
    public bgr m9999ri(AbstractC2646co abstractC2646co) throws IOException {
        return m10000ri(abstractC2646co, C2744ri.m10406fi());
    }

    /* JADX INFO: renamed from: ri */
    public bgr m10000ri(AbstractC2646co abstractC2646co, boolean z) throws IOException {
        boolean zM10405di = C2744ri.m10405di();
        List<String> listMo9890ri = abstractC2646co != null ? abstractC2646co.mo9890ri() : null;
        return (zM10405di && (listMo9890ri != null && !listMo9890ri.isEmpty())) ? m9993ri(abstractC2646co, listMo9890ri) : m9990lr(abstractC2646co, z);
    }

    @Override // com.bytedance.sdk.component.p160lr.p161ri.InterfaceC2651lr
    /* JADX INFO: renamed from: ri */
    public AbstractC2646co mo9924ri() {
        return this.f7589ri;
    }

    @Override // com.bytedance.sdk.component.p160lr.p161ri.InterfaceC2651lr
    /* JADX INFO: renamed from: ri */
    public void mo9925ri(final InterfaceC2649ik interfaceC2649ik) {
        AbstractC2646co abstractC2646co = this.f7589ri;
        if (abstractC2646co != null && abstractC2646co.f7529lr != null) {
            this.f7589ri.f7529lr.m9758vr();
        }
        this.f7588lr.mo9919lr().submit(new AbstractRunnableC2676ik(this.f7589ri.mo9888mj(), this.f7589ri.jbs()) { // from class: com.bytedance.sdk.component.lr.ri.ri.ri.lr.2
            @Override // java.lang.Runnable
            public void run() {
                try {
                    bgr bgrVarMo9923lr = C2667lr.this.mo9923lr();
                    if (bgrVarMo9923lr == null) {
                        interfaceC2649ik.mo6244ri(C2667lr.this, new IOException("response is null"));
                    } else {
                        interfaceC2649ik.mo6243ri(C2667lr.this, bgrVarMo9923lr);
                    }
                } catch (IOException e) {
                    interfaceC2649ik.mo6244ri(C2667lr.this, e);
                }
            }
        });
    }
}
