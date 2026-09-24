package com.mbridge.msdk.config.component.load;

import android.text.TextUtils;
import com.mbridge.msdk.config.component.base.C12709a;
import com.mbridge.msdk.config.component.common.file.C12752a;
import com.mbridge.msdk.config.component.common.file.C12753b;
import com.mbridge.msdk.config.component.common.util.C12770c;
import com.mbridge.msdk.config.component.load.downloader.C12787a;
import com.mbridge.msdk.config.component.load.downloader.C12788b;
import com.mbridge.msdk.config.component.load.downloader.C12812f;
import com.mbridge.msdk.config.component.load.downloader.C12813g;
import com.mbridge.msdk.config.component.load.downloader.DownloadProgress;
import com.mbridge.msdk.config.component.load.downloader.EnumC12789c;
import com.mbridge.msdk.config.component.load.downloader.InterfaceC12814h;
import com.mbridge.msdk.config.component.load.model.C12820a;
import com.mbridge.msdk.foundation.tools.C13219q0;
import com.tiktok.appevents.edp.TTEDPEventConstants;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public class LoadCpt extends C12709a {

    /* JADX INFO: renamed from: l */
    C12820a f34071l;

    /* JADX INFO: renamed from: h */
    private final String f34067h = "LoadCpt";

    /* JADX INFO: renamed from: i */
    final String f34068i = "1000001";

    /* JADX INFO: renamed from: j */
    final String f34069j = "1000002";

    /* JADX INFO: renamed from: k */
    final String f34070k = "1000003";

    /* JADX INFO: renamed from: m */
    int f34072m = 0;

    /* JADX INFO: renamed from: n */
    final InterfaceC12814h<Object> f34073n = new C12785a();

    /* JADX INFO: renamed from: g */
    private void m35333g() {
        try {
            C12753b c12753bM35056e = C12752a.m35056e(this.f34071l.m35515d());
            if (c12753bM35056e == null) {
                return;
            }
            int iM35513b = (int) (this.f34071l.m35513b() * 100.0f);
            C12820a c12820a = this.f34071l;
            C12813g.m35490a().m35491a(new C12788b<>(c12820a, c12820a.m35515d(), c12753bM35056e.m35063a(), iM35513b)).m35399b(this.f34071l.m35517f()).m35396a(this.f34071l.m35517f()).m35400c(this.f34071l.m35517f()).mo35397a(EnumC12789c.HIGH).withHttpRetryCounter(this.f34071l.m35516e()).mo35398a(this.f34073n).withTimeout(60000L).build().m35394n();
        } catch (Throwable th) {
            C13219q0.m37816b("LoadCpt", th.getMessage());
            HashMap map = new HashMap();
            map.put(C12770c.m35209b(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE), "");
            map.put(C12770c.m35209b("reason"), th.getMessage());
            m34829a(m34827a("912005", map));
        }
    }

    @Override // com.mbridge.msdk.config.component.base.C12709a
    /* JADX INFO: renamed from: b */
    public void mo34834b(Map<String, Object> map) {
        this.f33808f = "912001";
        this.f34071l = new C12820a(map);
        m35334h();
    }

    @Override // com.mbridge.msdk.config.component.base.C12709a
    /* JADX INFO: renamed from: d */
    public void mo34836d() {
        super.mo34836d();
        if (TextUtils.isEmpty(this.f34071l.m35511a())) {
            m34831a("912005", "1000001", "Input parameter error");
            return;
        }
        if (this.f34071l.m35511a().equals(C12770c.m35209b("310"))) {
            m35336j();
        }
        if (this.f34071l.m35511a().equals(C12770c.m35209b("311"))) {
            m35335i();
        }
    }

    /* JADX INFO: renamed from: h */
    public void m35334h() {
        try {
            if (C12813g.m35490a().m35495b()) {
                return;
            }
            C12813g.m35490a().m35492a(new C12812f.b().m35488a(this.f34071l.m35514c()).m35489a());
        } catch (Throwable th) {
            C13219q0.m37816b("LoadCpt", th.getMessage());
        }
    }

    /* JADX INFO: renamed from: i */
    public void m35335i() {
        if (this.f34071l != null) {
            String strM35494b = C12813g.m35490a().m35494b(this.f34071l.m35515d());
            if (TextUtils.isEmpty(strM35494b)) {
                return;
            }
            C12813g.m35490a().m35493a(strM35494b);
        }
    }

    /* JADX INFO: renamed from: j */
    public void m35336j() {
        if (this.f34071l != null) {
            m35333g();
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.config.component.load.LoadCpt$a */
    class C12785a implements InterfaceC12814h<Object> {
        C12785a() {
        }

        @Override // com.mbridge.msdk.config.component.load.downloader.InterfaceC12814h
        /* JADX INFO: renamed from: a */
        public void mo35337a(C12788b<Object> c12788b) {
        }

        @Override // com.mbridge.msdk.config.component.load.downloader.InterfaceC12814h
        /* JADX INFO: renamed from: a */
        public void mo35339a(C12788b<Object> c12788b, C12787a c12787a) {
            HashMap map = new HashMap();
            map.put(C12770c.m35209b("percent"), String.valueOf(c12788b.m35352b()));
            map.put(C12770c.m35209b("file_size"), String.valueOf(c12788b.m35346a()));
            map.put(C12770c.m35209b(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE), "1000002");
            map.put(C12770c.m35209b("reason"), c12787a.m35345a().getMessage());
            LoadCpt loadCpt = LoadCpt.this;
            loadCpt.m34829a(loadCpt.m34827a("912005", map));
        }

        @Override // com.mbridge.msdk.config.component.load.downloader.InterfaceC12814h
        /* JADX INFO: renamed from: b */
        public void mo35340b(C12788b<Object> c12788b) {
            HashMap map = new HashMap();
            map.put(C12770c.m35209b("file_size"), String.valueOf(c12788b.m35346a()));
            LoadCpt loadCpt = LoadCpt.this;
            loadCpt.m34829a(loadCpt.m34827a("912002", map));
        }

        @Override // com.mbridge.msdk.config.component.load.downloader.InterfaceC12814h
        /* JADX INFO: renamed from: c */
        public void mo35341c(C12788b<Object> c12788b) {
        }

        @Override // com.mbridge.msdk.config.component.load.downloader.InterfaceC12814h
        /* JADX INFO: renamed from: d */
        public void mo35342d(C12788b<Object> c12788b) {
            HashMap map = new HashMap();
            map.put(C12770c.m35209b("percent"), String.valueOf(c12788b.m35352b()));
            map.put(C12770c.m35209b("file_size"), String.valueOf(c12788b.m35346a()));
            map.put(C12770c.m35209b("file_path"), c12788b.m35355e());
            map.put(C12770c.m35209b("md5"), c12788b.m35356f());
            try {
                C12753b c12753bM35056e = C12752a.m35056e(LoadCpt.this.f34071l.m35515d());
                if (c12753bM35056e != null && c12753bM35056e.m35066b().contains("zip") && c12788b.m35352b() >= 100.0f) {
                    if (TextUtils.isEmpty(c12753bM35056e.m35070d())) {
                        map.put(C12770c.m35209b("file_path"), c12753bM35056e.m35070d());
                    } else {
                        if (!C12752a.m35053b(c12788b.m35355e(), C12752a.m35058g(LoadCpt.this.f34071l.m35515d()))) {
                            LoadCpt.this.m34831a("912005", "1000003", "Unzip file failed");
                            return;
                        }
                        map.put(C12770c.m35209b("file_path"), C12752a.m35061j(LoadCpt.this.f34071l.m35515d()));
                    }
                }
                LoadCpt loadCpt = LoadCpt.this;
                loadCpt.m34829a(loadCpt.m34827a("912004", map));
            } catch (Exception e) {
                LoadCpt.this.m34831a("912005", "1000002", e.getMessage());
            }
        }

        @Override // com.mbridge.msdk.config.component.load.downloader.InterfaceC12814h
        /* JADX INFO: renamed from: a */
        public void mo35338a(C12788b<Object> c12788b, DownloadProgress downloadProgress) {
            int currentDownloadRate = downloadProgress.getCurrentDownloadRate();
            if (c12788b.m35357g()) {
                return;
            }
            LoadCpt loadCpt = LoadCpt.this;
            if (currentDownloadRate == loadCpt.f34072m) {
                return;
            }
            loadCpt.f34072m = currentDownloadRate;
            HashMap map = new HashMap();
            map.put(C12770c.m35209b("percent"), String.valueOf(currentDownloadRate));
            map.put(C12770c.m35209b("file_size"), String.valueOf(downloadProgress.getTotal()));
            LoadCpt loadCpt2 = LoadCpt.this;
            loadCpt2.m34829a(loadCpt2.m34827a("912003", map));
        }
    }
}
