package com.bytedance.sdk.openadsdk.core.settings;

import android.content.Context;
import android.os.SystemClock;
import com.bytedance.sdk.component.p165mj.p166lr.AbstractRunnableC2676ik;
import com.bytedance.sdk.component.utils.C2707ac;
import com.bytedance.sdk.openadsdk.core.C3299nr;
import com.bytedance.sdk.openadsdk.utils.C3561aw;
import com.bytedance.sdk.openadsdk.utils.dzy;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.settings.qt */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3320qt implements InterfaceC3312fi {

    /* JADX INFO: renamed from: qt */
    private final ri f11612qt;

    /* JADX INFO: renamed from: sf */
    private boolean f11613sf;
    private final String xha;

    /* JADX INFO: renamed from: ik */
    private final ConcurrentHashMap<String, Object> f11609ik = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: ka */
    private final Object f11610ka = new Object();

    /* JADX INFO: renamed from: fi */
    private final Object f11608fi = new Object();

    /* JADX INFO: renamed from: di */
    private final CountDownLatch f11607di = new CountDownLatch(1);

    /* JADX INFO: renamed from: mj */
    private Properties f11611mj = new Properties();
    private volatile boolean jbs = false;

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.settings.qt$lr */
    public class lr implements InterfaceC3312fi.ri {

        /* JADX INFO: renamed from: lr */
        private final Map<String, Object> f11616lr = new HashMap();

        /* JADX INFO: renamed from: ik */
        private final Object f11615ik = new Object();

        public lr() {
        }

        @Override // com.bytedance.sdk.openadsdk.core.settings.InterfaceC3312fi.ri
        /* JADX INFO: renamed from: ri */
        public InterfaceC3312fi.ri mo14760ri(String str) {
            synchronized (this.f11615ik) {
                this.f11616lr.put(str, this);
            }
            return this;
        }

        @Override // com.bytedance.sdk.openadsdk.core.settings.InterfaceC3312fi.ri
        /* JADX INFO: renamed from: ri */
        public InterfaceC3312fi.ri mo14761ri(String str, float f) {
            synchronized (this.f11615ik) {
                this.f11616lr.put(str, Float.valueOf(f));
            }
            return this;
        }

        @Override // com.bytedance.sdk.openadsdk.core.settings.InterfaceC3312fi.ri
        /* JADX INFO: renamed from: ri */
        public InterfaceC3312fi.ri mo14762ri(String str, int i) {
            synchronized (this.f11615ik) {
                this.f11616lr.put(str, Integer.valueOf(i));
            }
            return this;
        }

        @Override // com.bytedance.sdk.openadsdk.core.settings.InterfaceC3312fi.ri
        /* JADX INFO: renamed from: ri */
        public InterfaceC3312fi.ri mo14763ri(String str, long j) {
            synchronized (this.f11615ik) {
                this.f11616lr.put(str, Long.valueOf(j));
            }
            return this;
        }

        @Override // com.bytedance.sdk.openadsdk.core.settings.InterfaceC3312fi.ri
        /* JADX INFO: renamed from: ri */
        public InterfaceC3312fi.ri mo14764ri(String str, String str2) {
            synchronized (this.f11615ik) {
                this.f11616lr.put(str, str2);
            }
            return this;
        }

        @Override // com.bytedance.sdk.openadsdk.core.settings.InterfaceC3312fi.ri
        /* JADX INFO: renamed from: ri */
        public InterfaceC3312fi.ri mo14765ri(String str, boolean z) {
            synchronized (this.f11615ik) {
                this.f11616lr.put(str, Boolean.valueOf(z));
            }
            return this;
        }

        @Override // com.bytedance.sdk.openadsdk.core.settings.InterfaceC3312fi.ri
        /* JADX INFO: renamed from: ri */
        public void mo14766ri() {
            Object obj;
            Properties properties = new Properties();
            synchronized (this.f11615ik) {
                properties.putAll(AbstractC3320qt.this.f11611mj);
                boolean z = false;
                for (Map.Entry<String, Object> entry : this.f11616lr.entrySet()) {
                    String key = entry.getKey();
                    Object value = entry.getValue();
                    if (value == this || value == null) {
                        if (properties.containsKey(key)) {
                            properties.remove(key);
                            z = true;
                        }
                    } else if (!properties.containsKey(key) || (obj = properties.get(key)) == null || !obj.equals(value)) {
                        properties.put(key, String.valueOf(value));
                        z = true;
                    }
                }
                this.f11616lr.clear();
                if (z) {
                    AbstractC3320qt.this.m14798ri(properties);
                    AbstractC3320qt.this.f11611mj = properties;
                    AbstractC3320qt.this.f11609ik.clear();
                    AbstractC3320qt.this.f11613sf = false;
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.settings.qt$ri */
    public interface ri {
        /* JADX INFO: renamed from: lr */
        void mo14811lr();

        /* JADX INFO: renamed from: ri */
        void mo14812ri();
    }

    public AbstractC3320qt(ri riVar) {
        String strMo14792ri = mo14792ri();
        this.xha = strMo14792ri;
        this.f11612qt = riVar;
        dzy.m16409ri(new AbstractRunnableC2676ik("SetL_" + strMo14792ri) { // from class: com.bytedance.sdk.openadsdk.core.settings.qt.1
            @Override // java.lang.Runnable
            public void run() {
                AbstractC3320qt.this.m14809ri(false);
            }
        });
    }

    /* JADX INFO: renamed from: di */
    private void m14793di() {
        if (this.f11613sf && C3299nr.m14642ri() != null) {
            m14809ri(true);
        }
        if (this.jbs) {
            return;
        }
        try {
            SystemClock.elapsedRealtime();
            this.f11607di.await(dzy.m16391di() ? 4 : 8, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            C2707ac.m10206ri("SdkSettings.Prop", "awaitLoadedLocked: ", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ri */
    public void m14798ri(Properties properties) {
        synchronized (this.f11608fi) {
            FileOutputStream fileOutputStream = null;
            try {
                try {
                    FileOutputStream fileOutputStream2 = new FileOutputStream(xha());
                    try {
                        properties.store(fileOutputStream2, (String) null);
                        C3561aw.m16367ri(fileOutputStream2);
                    } catch (Exception e) {
                        e = e;
                        fileOutputStream = fileOutputStream2;
                        C2707ac.m10206ri("SdkSettings.Prop", "saveToLocal: ", e);
                        if (fileOutputStream != null) {
                            C3561aw.m16367ri(fileOutputStream);
                        }
                    } catch (Throwable th) {
                        th = th;
                        fileOutputStream = fileOutputStream2;
                        if (fileOutputStream != null) {
                            C3561aw.m16367ri(fileOutputStream);
                        }
                        throw th;
                    }
                } catch (Exception e2) {
                    e = e2;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    private File xha() {
        Context contextM14642ri = C3299nr.m14642ri();
        if (contextM14642ri != null) {
            return new File(contextM14642ri.getFilesDir(), this.xha);
        }
        return null;
    }

    /* JADX INFO: renamed from: fi */
    protected void m14800fi() {
        ri riVar = this.f11612qt;
        if (riVar != null) {
            riVar.mo14811lr();
        }
    }

    /* JADX INFO: renamed from: ik */
    public boolean m14801ik() {
        return this.jbs;
    }

    /* JADX INFO: renamed from: ka */
    public void m14802ka() {
        File fileXha = xha();
        if (fileXha == null || !fileXha.exists()) {
            return;
        }
        fileXha.delete();
    }

    /* JADX INFO: renamed from: lr */
    public InterfaceC3312fi.ri m14803lr() {
        return new lr();
    }

    /* JADX INFO: renamed from: ri */
    public float m14804ri(String str, float f) {
        if (str != null && !str.isEmpty()) {
            m14793di();
            try {
                return Float.parseFloat(this.f11611mj.getProperty(str, String.valueOf(f)));
            } catch (NumberFormatException e) {
                C2707ac.m10206ri("SdkSettings.Prop", "", e);
            }
        }
        return f;
    }

    /* JADX INFO: renamed from: ri */
    public int m14805ri(String str, int i) {
        if (str != null && !str.isEmpty()) {
            m14793di();
            try {
                return Integer.parseInt(this.f11611mj.getProperty(str, String.valueOf(i)));
            } catch (NumberFormatException e) {
                C2707ac.m10206ri("SdkSettings.Prop", "", e);
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: ri */
    public long m14806ri(String str, long j) {
        if (str != null && !str.isEmpty()) {
            m14793di();
            try {
                return Long.parseLong(this.f11611mj.getProperty(str, String.valueOf(j)));
            } catch (NumberFormatException e) {
                C2707ac.m10206ri("SdkSettings.Prop", "", e);
            }
        }
        return j;
    }

    /* JADX INFO: renamed from: ri */
    public <T> T m14807ri(String str, T t, InterfaceC3312fi.lr<T> lrVar) {
        T tMo14757lr;
        if (str != null && !str.isEmpty()) {
            T t2 = (T) this.f11609ik.get(str);
            if (t2 != null) {
                return t2;
            }
            m14793di();
            String property = this.f11611mj.getProperty(str, null);
            if (property != null && lrVar != null && (tMo14757lr = lrVar.mo14757lr(property)) != null) {
                this.f11609ik.put(str, tMo14757lr);
                return tMo14757lr;
            }
        }
        return t;
    }

    /* JADX INFO: renamed from: ri */
    protected abstract String mo14792ri();

    /* JADX INFO: renamed from: ri */
    public String m14808ri(String str, String str2) {
        if (str == null || str.isEmpty()) {
            return str2;
        }
        m14793di();
        return this.f11611mj.getProperty(str, str2);
    }

    /* JADX INFO: renamed from: ri */
    public void m14809ri(boolean z) {
        ri riVar;
        Object obj;
        synchronized (this.f11610ka) {
            if (!this.jbs || z) {
                if (C3299nr.m14642ri() != null) {
                    this.f11613sf = false;
                    File fileXha = xha();
                    if (fileXha != null && fileXha.exists()) {
                        Properties properties = new Properties();
                        FileInputStream fileInputStream = null;
                        try {
                            try {
                                FileInputStream fileInputStream2 = new FileInputStream(fileXha);
                                try {
                                    properties.load(fileInputStream2);
                                    Integer.valueOf(properties.size());
                                    new StringBuilder("items from ").append(fileXha.getAbsolutePath());
                                    if (!properties.isEmpty()) {
                                        this.f11611mj = properties;
                                        this.f11609ik.clear();
                                    }
                                    C3561aw.m16367ri(fileInputStream2);
                                    obj = this.f11610ka;
                                } catch (OutOfMemoryError unused) {
                                    fileInputStream = fileInputStream2;
                                    try {
                                        com.bytedance.sdk.component.utils.xha.m10326ik(fileXha);
                                    } catch (Throwable th) {
                                        C2707ac.m10206ri("SdkSettings.Prop", "delete: ", th);
                                    }
                                    if (fileInputStream != null) {
                                        C3561aw.m16367ri(fileInputStream);
                                    }
                                    obj = this.f11610ka;
                                } catch (Throwable th2) {
                                    th = th2;
                                    fileInputStream = fileInputStream2;
                                    C2707ac.m10206ri("SdkSettings.Prop", "reload: ", th);
                                    if (fileInputStream != null) {
                                        C3561aw.m16367ri(fileInputStream);
                                    }
                                    obj = this.f11610ka;
                                }
                            } catch (Throwable th3) {
                                if (fileInputStream != null) {
                                    C3561aw.m16367ri(fileInputStream);
                                }
                                this.f11610ka.notifyAll();
                                throw th3;
                            }
                        } catch (OutOfMemoryError unused2) {
                        } catch (Throwable th4) {
                            th = th4;
                        }
                        obj.notifyAll();
                    }
                } else {
                    this.f11613sf = true;
                }
                boolean z2 = this.jbs;
                this.f11607di.countDown();
                this.jbs = true;
                if (!z2 && (riVar = this.f11612qt) != null) {
                    riVar.mo14812ri();
                }
            }
        }
    }

    /* JADX INFO: renamed from: ri */
    public boolean m14810ri(String str, boolean z) {
        if (str != null && !str.isEmpty()) {
            m14793di();
            try {
                return Boolean.parseBoolean(this.f11611mj.getProperty(str, String.valueOf(z)));
            } catch (Exception e) {
                C2707ac.m10206ri("SdkSettings.Prop", "", e);
            }
        }
        return z;
    }
}
