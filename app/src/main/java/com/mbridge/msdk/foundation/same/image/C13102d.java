package com.mbridge.msdk.foundation.same.image;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.DownloadError;
import com.mbridge.msdk.foundation.download.DownloadMessage;
import com.mbridge.msdk.foundation.download.DownloadPriority;
import com.mbridge.msdk.foundation.download.DownloadResourceType;
import com.mbridge.msdk.foundation.download.MBDownloadManager;
import com.mbridge.msdk.foundation.download.OnDownloadStateListener;
import com.mbridge.msdk.foundation.download.core.DownloadRequest;
import com.mbridge.msdk.foundation.same.C13088a;
import com.mbridge.msdk.foundation.same.directory.C13098e;
import com.mbridge.msdk.foundation.same.directory.EnumC13096c;
import com.mbridge.msdk.foundation.tools.C13215o0;
import com.mbridge.msdk.foundation.tools.C13219q0;
import java.io.File;
import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: renamed from: com.mbridge.msdk.foundation.same.image.d */
/* JADX INFO: compiled from: CommonImageLoaderRefactor.java */
/* JADX INFO: loaded from: classes6.dex */
public class C13102d {

    /* JADX INFO: renamed from: a */
    private final ThreadPoolExecutor f35930a;

    /* JADX INFO: renamed from: b */
    private final Handler f35931b;

    /* JADX INFO: renamed from: c */
    private final String f35932c;

    /* JADX INFO: renamed from: com.mbridge.msdk.foundation.same.image.d$a */
    /* JADX INFO: compiled from: CommonImageLoaderRefactor.java */
    class a implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ String f35933a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ InterfaceC13101c f35934b;

        /* JADX INFO: renamed from: com.mbridge.msdk.foundation.same.image.d$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: CommonImageLoaderRefactor.java */
        class RunnableC15551a implements Runnable {
            RunnableC15551a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                a aVar = a.this;
                aVar.f35934b.onFailedLoad("create download request error", aVar.f35933a);
            }
        }

        a(String str, InterfaceC13105g interfaceC13105g, InterfaceC13101c interfaceC13101c) {
            this.f35933a = str;
            this.f35934b = interfaceC13101c;
        }

        @Override // java.lang.Runnable
        public void run() {
            DownloadRequest downloadRequestM37162a = C13102d.this.m37162a(C13215o0.m37804d(this.f35933a), this.f35933a, null, this.f35934b);
            if (downloadRequestM37162a != null) {
                downloadRequestM37162a.start();
                return;
            }
            if (MBridgeConstans.DEBUG) {
                C13219q0.m37816b("CommonImageLoaderRefactor", "createDownloadRequest error");
            }
            if (this.f35934b == null) {
                return;
            }
            C13102d.this.f35931b.post(new RunnableC15551a());
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.foundation.same.image.d$b */
    /* JADX INFO: compiled from: CommonImageLoaderRefactor.java */
    private static final class b {

        /* JADX INFO: renamed from: a */
        private static final C13102d f35937a = new C13102d(null);
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.foundation.same.image.d$c */
    /* JADX INFO: compiled from: CommonImageLoaderRefactor.java */
    private static final class c implements OnDownloadStateListener<Object> {

        /* JADX INFO: renamed from: a */
        private final ThreadPoolExecutor f35938a;

        /* JADX INFO: renamed from: b */
        private final Handler f35939b;

        /* JADX INFO: renamed from: c */
        private final String f35940c;

        /* JADX INFO: renamed from: d */
        private final String f35941d;

        /* JADX INFO: renamed from: e */
        private final String f35942e;

        /* JADX INFO: renamed from: f */
        private final InterfaceC13101c f35943f;

        /* JADX INFO: renamed from: com.mbridge.msdk.foundation.same.image.d$c$a */
        /* JADX INFO: compiled from: CommonImageLoaderRefactor.java */
        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                c.this.m37171a();
            }
        }

        /* JADX INFO: renamed from: com.mbridge.msdk.foundation.same.image.d$c$b */
        /* JADX INFO: compiled from: CommonImageLoaderRefactor.java */
        class b implements Runnable {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ String f35945a;

            b(String str) {
                this.f35945a = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    c.this.f35943f.onFailedLoad(c.this.f35942e, this.f35945a);
                } catch (Exception e) {
                    if (MBridgeConstans.DEBUG) {
                        C13219q0.m37817b("CommonImageLoaderRefactor", "callbackForFailed error", e);
                    }
                }
            }
        }

        /* JADX INFO: renamed from: com.mbridge.msdk.foundation.same.image.d$c$c, reason: collision with other inner class name */
        /* JADX INFO: compiled from: CommonImageLoaderRefactor.java */
        class RunnableC15552c implements Runnable {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ Bitmap f35947a;

            RunnableC15552c(Bitmap bitmap) {
                this.f35947a = bitmap;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    c.this.f35943f.onSuccessLoad(this.f35947a, c.this.f35942e);
                } catch (Exception e) {
                    if (MBridgeConstans.DEBUG) {
                        C13219q0.m37817b("CommonImageLoaderRefactor", "callbackForSuccess error", e);
                    }
                }
            }
        }

        public c(Handler handler, ThreadPoolExecutor threadPoolExecutor, String str, String str2, String str3, InterfaceC13105g interfaceC13105g, InterfaceC13101c interfaceC13101c) {
            this.f35939b = handler;
            this.f35938a = threadPoolExecutor;
            this.f35942e = str;
            this.f35940c = str2;
            this.f35941d = str3;
            this.f35943f = interfaceC13101c;
        }

        @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
        public void onCancelDownload(DownloadMessage<Object> downloadMessage) {
        }

        @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
        public void onDownloadComplete(DownloadMessage<Object> downloadMessage) {
            m37176b();
            this.f35938a.execute(new a());
        }

        @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
        public void onDownloadError(DownloadMessage<Object> downloadMessage, DownloadError downloadError) {
            if (MBridgeConstans.DEBUG) {
                C13219q0.m37813a("CommonImageLoaderRefactor", "onDownloadError imageUrl = " + downloadError.getException().getLocalizedMessage());
            }
            m37174a(downloadError.getException().getLocalizedMessage());
        }

        @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
        public void onDownloadStart(DownloadMessage<Object> downloadMessage) {
        }

        @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
        public void onResponseStart(DownloadMessage<Object> downloadMessage) {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: a */
        public void m37171a() {
            if (this.f35943f == null) {
                return;
            }
            try {
                Bitmap bitmapM37165b = C13102d.m37165b(this.f35940c + this.f35941d);
                if (bitmapM37165b == null) {
                    m37174a("bitmap decode failed");
                    return;
                }
                Bitmap bitmapM37170a = m37170a(bitmapM37165b, null);
                if (bitmapM37170a == null) {
                    m37174a("bitmap transformation failed");
                } else {
                    m37172a(bitmapM37170a);
                }
            } catch (Exception e) {
                if (MBridgeConstans.DEBUG) {
                    C13219q0.m37813a("CommonImageLoaderRefactor", "onDownloadComplete decodeBitmap error = " + e.getLocalizedMessage());
                }
                m37174a("bitmap decode failed");
            }
        }

        /* JADX INFO: renamed from: b */
        private void m37176b() {
            File file;
            if (MBridgeConstans.DEBUG) {
                C13219q0.m37813a("CommonImageLoaderRefactor", "onDownloadComplete imageUrl = " + this.f35942e + " imagePath = " + this.f35940c + this.f35941d);
                try {
                    file = new File(this.f35940c + this.f35941d);
                } catch (Exception e) {
                    if (MBridgeConstans.DEBUG) {
                        C13219q0.m37817b("CommonImageLoaderRefactor", "onDownloadComplete error", e);
                    }
                    file = null;
                }
                if (file == null || !file.isFile() || !file.exists()) {
                    C13219q0.m37816b("CommonImageLoaderRefactor", "onDownloadComplete file not exist");
                    return;
                }
                C13219q0.m37813a("CommonImageLoaderRefactor", "onDownloadComplete file size = " + file.length());
            }
        }

        /* JADX INFO: renamed from: a */
        private void m37174a(String str) {
            if (this.f35943f == null) {
                return;
            }
            this.f35939b.post(new b(str));
        }

        /* JADX INFO: renamed from: a */
        private Bitmap m37170a(Bitmap bitmap, InterfaceC13105g interfaceC13105g) {
            if (interfaceC13105g != null) {
                try {
                    return interfaceC13105g.m37181a(bitmap);
                } catch (Exception e) {
                    if (MBridgeConstans.DEBUG) {
                        C13219q0.m37817b("CommonImageLoaderRefactor", "handlerImageTransformation error", e);
                    }
                }
            }
            return bitmap;
        }

        /* JADX INFO: renamed from: a */
        private void m37172a(Bitmap bitmap) {
            if (this.f35943f == null) {
                return;
            }
            this.f35939b.post(new RunnableC15552c(bitmap));
        }
    }

    /* synthetic */ C13102d(a aVar) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static Bitmap m37165b(String str) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(str, options);
        options.inJustDecodeBounds = false;
        options.inPurgeable = true;
        options.inInputShareable = true;
        options.inDither = true;
        return BitmapFactory.decodeFile(str, options);
    }

    /* JADX INFO: renamed from: c */
    public Bitmap m37167c(String str) {
        if (MBridgeConstans.DEBUG) {
            C13219q0.m37813a("CommonImageLoaderRefactor", "getImageBitmapByUrl imageUrl = " + str);
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String str2 = this.f35932c + C13215o0.m37804d(str);
        File file = new File(str2);
        if (file.isFile() && file.exists()) {
            try {
                return m37165b(str2);
            } catch (Exception e) {
                if (MBridgeConstans.DEBUG) {
                    C13219q0.m37817b("CommonImageLoaderRefactor", "getImageBitmapByUrl error", e);
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public boolean m37168d(String str) {
        File file;
        if (MBridgeConstans.DEBUG) {
            C13219q0.m37813a("CommonImageLoaderRefactor", "isImageFileExists imageUrl = " + str);
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            try {
                file = new File(this.f35932c + C13215o0.m37804d(str));
            } catch (Exception e) {
                if (MBridgeConstans.DEBUG) {
                    C13219q0.m37817b("CommonImageLoaderRefactor", "isImageFileExists error", e);
                }
                file = null;
            }
            return file != null && file.isFile() && file.exists();
        } catch (Exception e2) {
            if (MBridgeConstans.DEBUG) {
                C13219q0.m37817b("CommonImageLoaderRefactor", "isImageFileExists error", e2);
            }
            return false;
        }
    }

    private C13102d() {
        this.f35931b = new Handler(Looper.getMainLooper());
        this.f35932c = C13098e.m37149b(EnumC13096c.MBRIDGE_700_IMG) + File.separator;
        this.f35930a = C13104f.m37180b();
    }

    /* JADX INFO: renamed from: a */
    public static C13102d m37163a() {
        return b.f35937a;
    }

    /* JADX INFO: renamed from: a */
    private Runnable m37164a(String str, InterfaceC13105g interfaceC13105g, InterfaceC13101c interfaceC13101c) {
        return new a(str, interfaceC13105g, interfaceC13101c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public DownloadRequest<?> m37162a(String str, String str2, InterfaceC13105g interfaceC13105g, InterfaceC13101c interfaceC13101c) {
        try {
            return MBDownloadManager.getInstance().download(new DownloadMessage<>(new Object(), str2, str, 100, DownloadResourceType.DOWNLOAD_RESOURCE_TYPE_IMAGE)).withReadTimeout(C13088a.f35879u).withConnectTimeout(C13088a.f35878t).withWriteTimeout(C13088a.f35877s).withDownloadPriority(DownloadPriority.LOW).withHttpRetryCounter(1).withDirectoryPathInternal(this.f35932c).withDownloadStateListener(new c(this.f35931b, this.f35930a, str2, this.f35932c, str, interfaceC13105g, interfaceC13101c)).with("download_scene", "download_image").withProgressStateListener(null).withTimeout(60000L).with("do_us_fi_re", Boolean.FALSE.toString()).build();
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                C13219q0.m37817b("CommonImageLoaderRefactor", "createDownloadRequest error", e);
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public void m37166b(String str, InterfaceC13105g interfaceC13105g, InterfaceC13101c interfaceC13101c) {
        try {
            this.f35930a.execute(m37164a(str, interfaceC13105g, interfaceC13101c));
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                C13219q0.m37817b("CommonImageLoaderRefactor", "loadImage error", e);
            }
        }
    }
}
