package com.mbridge.msdk.config.component.load.downloader.database;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Handler;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.config.component.database.C12773c;
import com.mbridge.msdk.config.component.load.downloader.utils.C12818a;
import com.mbridge.msdk.foundation.download.database.IDatabaseHelper;
import com.mbridge.msdk.foundation.tools.C13219q0;

/* JADX INFO: renamed from: com.mbridge.msdk.config.component.load.downloader.database.a */
/* JADX INFO: compiled from: DatabaseHelper.java */
/* JADX INFO: loaded from: classes5.dex */
public class C12807a implements InterfaceC12809c {

    /* JADX INFO: renamed from: a */
    private final InterfaceC12810d f34185a;

    /* JADX INFO: renamed from: b */
    private final Handler f34186b;

    /* JADX INFO: renamed from: c */
    private final String f34187c = C12773c.TABLE_FILE_DB;

    /* JADX INFO: renamed from: d */
    private volatile SQLiteDatabase f34188d;

    /* JADX INFO: renamed from: com.mbridge.msdk.config.component.load.downloader.database.a$a */
    /* JADX INFO: compiled from: DatabaseHelper.java */
    class a implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ InterfaceC12809c.a f34189a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f34190b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ String f34191c;

        a(InterfaceC12809c.a aVar, String str, String str2) {
            this.f34189a = aVar;
            this.f34190b = str;
            this.f34191c = str2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r0v4, types: [android.database.Cursor] */
        /* JADX WARN: Type inference failed for: r0v6 */
        @Override // java.lang.Runnable
        public void run() throws Throwable {
            Cursor cursorRawQuery;
            InterfaceC12809c.a aVar;
            ?? r0 = " WHERE URL = ? AND filePath = ?";
            if (C12818a.m35509b(C12807a.this.f34188d)) {
                C12807a c12807a = C12807a.this;
                c12807a.f34188d = c12807a.f34185a.getWritableDatabase();
            }
            C12808b c12808bM35453a = null;
            if (!C12818a.m35509b(C12807a.this.f34188d)) {
                try {
                    if (C12807a.this.f34188d.isOpen()) {
                        try {
                            cursorRawQuery = C12807a.this.f34188d.rawQuery("SELECT * FROM " + C12807a.this.f34187c + " WHERE URL = ? AND filePath = ?", new String[]{this.f34190b, this.f34191c});
                            if (cursorRawQuery != null) {
                                try {
                                    if (cursorRawQuery.moveToFirst()) {
                                        c12808bM35453a = C12808b.m35453a(cursorRawQuery);
                                    }
                                } catch (Exception e) {
                                    e = e;
                                    if (MBridgeConstans.DEBUG) {
                                        e.printStackTrace();
                                    }
                                    if (cursorRawQuery != null) {
                                        cursorRawQuery.close();
                                    }
                                    aVar = this.f34189a;
                                    if (aVar == null) {
                                        return;
                                    }
                                }
                            }
                            if (cursorRawQuery != null) {
                                cursorRawQuery.close();
                            }
                            aVar = this.f34189a;
                            if (aVar == null) {
                                return;
                            }
                        } catch (Exception e2) {
                            e = e2;
                            cursorRawQuery = null;
                        } catch (Throwable th) {
                            th = th;
                            r0 = 0;
                            if (r0 != 0) {
                                r0.close();
                            }
                            InterfaceC12809c.a aVar2 = this.f34189a;
                            if (aVar2 != null) {
                                aVar2.mo35414a(null);
                            }
                            throw th;
                        }
                        aVar.mo35414a(c12808bM35453a);
                        return;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }
            if (C12818a.m35507a(this.f34189a)) {
                this.f34189a.mo35414a(null);
            }
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.config.component.load.downloader.database.a$b */
    /* JADX INFO: compiled from: DatabaseHelper.java */
    class b implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C12808b f34193a;

        b(C12808b c12808b) {
            this.f34193a = c12808b;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C12818a.m35509b(C12807a.this.f34188d)) {
                C12807a c12807a = C12807a.this;
                c12807a.f34188d = c12807a.f34185a.getWritableDatabase();
            }
            if (C12818a.m35509b(C12807a.this.f34188d) || !C12807a.this.f34188d.isOpen()) {
                return;
            }
            try {
                C12807a.this.f34188d.beginTransaction();
                C12807a.this.f34188d.insert(C12807a.this.f34187c, null, C12808b.m35452a(this.f34193a));
                C12807a.this.f34188d.setTransactionSuccessful();
            } catch (Exception e) {
                C13219q0.m37816b(IDatabaseHelper.TAG, e.getMessage());
            } finally {
                try {
                    if (C12807a.this.f34188d.inTransaction()) {
                        C12807a.this.f34188d.endTransaction();
                    }
                } catch (Throwable th) {
                    C13219q0.m37816b(IDatabaseHelper.TAG, th.getMessage());
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.config.component.load.downloader.database.a$c */
    /* JADX INFO: compiled from: DatabaseHelper.java */
    class c implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C12808b f34195a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f34196b;

        c(C12808b c12808b, String str) {
            this.f34195a = c12808b;
            this.f34196b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C12818a.m35509b(C12807a.this.f34188d)) {
                C12807a c12807a = C12807a.this;
                c12807a.f34188d = c12807a.f34185a.getWritableDatabase();
            }
            if (C12818a.m35509b(C12807a.this.f34188d) || !C12807a.this.f34188d.isOpen()) {
                return;
            }
            try {
                C12807a.this.f34188d.update(C12807a.this.f34187c, C12808b.m35452a(this.f34195a), "URL = ? AND filePath = ?", new String[]{this.f34195a.m35462c(), this.f34196b});
            } catch (Exception e) {
                C13219q0.m37816b(IDatabaseHelper.TAG, e.getMessage());
            }
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.config.component.load.downloader.database.a$d */
    /* JADX INFO: compiled from: DatabaseHelper.java */
    class d implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C12808b f34198a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f34199b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ String f34200c;

        d(C12808b c12808b, String str, String str2) {
            this.f34198a = c12808b;
            this.f34199b = str;
            this.f34200c = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C12818a.m35509b(C12807a.this.f34188d)) {
                C12807a c12807a = C12807a.this;
                c12807a.f34188d = c12807a.f34185a.getWritableDatabase();
            }
            if (C12818a.m35509b(C12807a.this.f34188d) || !C12807a.this.f34188d.isOpen()) {
                return;
            }
            try {
                C12807a.this.f34188d.update(C12807a.this.f34187c, C12808b.m35452a(this.f34198a), "URL = ? AND filePath = ?", new String[]{this.f34199b, this.f34200c});
            } catch (Exception e) {
                C13219q0.m37816b(IDatabaseHelper.TAG, e.getMessage());
            }
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.config.component.load.downloader.database.a$e */
    /* JADX INFO: compiled from: DatabaseHelper.java */
    class e implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ String f34202a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f34203b;

        e(String str, String str2) {
            this.f34202a = str;
            this.f34203b = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C12818a.m35509b(C12807a.this.f34188d)) {
                C12807a c12807a = C12807a.this;
                c12807a.f34188d = c12807a.f34185a.getWritableDatabase();
            }
            if (C12818a.m35509b(C12807a.this.f34188d) || !C12807a.this.f34188d.isOpen()) {
                return;
            }
            try {
                C12807a.this.f34188d.execSQL("DELETE FROM " + C12807a.this.f34187c + " WHERE URL = ? AND filePath = ?", new Object[]{this.f34202a, this.f34203b});
            } catch (Exception e) {
                C13219q0.m37816b(IDatabaseHelper.TAG, e.getMessage());
            }
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.config.component.load.downloader.database.a$f */
    /* JADX INFO: compiled from: DatabaseHelper.java */
    class f implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ String f34205a;

        f(String str) {
            this.f34205a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C12818a.m35509b(C12807a.this.f34188d)) {
                C12807a c12807a = C12807a.this;
                c12807a.f34188d = c12807a.f34185a.getWritableDatabase();
            }
            if (C12818a.m35509b(C12807a.this.f34188d) || !C12807a.this.f34188d.isOpen()) {
                return;
            }
            try {
                C12807a.this.f34188d.execSQL("DELETE FROM " + C12807a.this.f34187c + " WHERE URL = ?", new Object[]{this.f34205a});
            } catch (Exception e) {
                C13219q0.m37816b(IDatabaseHelper.TAG, e.getMessage());
            }
        }
    }

    public C12807a(Handler handler, InterfaceC12810d interfaceC12810d) {
        this.f34186b = handler;
        this.f34185a = interfaceC12810d;
    }

    @Override // com.mbridge.msdk.config.component.load.downloader.database.InterfaceC12809c
    public void remove(String str, String str2) {
        this.f34186b.post(new e(str, str2));
    }

    @Override // com.mbridge.msdk.config.component.load.downloader.database.InterfaceC12809c
    public void remove(String str) {
        this.f34186b.post(new f(str));
    }

    @Override // com.mbridge.msdk.config.component.load.downloader.database.InterfaceC12809c
    /* JADX INFO: renamed from: a */
    public void mo35451a(String str, String str2, InterfaceC12809c.a aVar) {
        this.f34186b.post(new a(aVar, str, str2));
    }

    @Override // com.mbridge.msdk.config.component.load.downloader.database.InterfaceC12809c
    /* JADX INFO: renamed from: a */
    public void mo35448a(C12808b c12808b) {
        this.f34186b.postAtFrontOfQueue(new b(c12808b));
    }

    @Override // com.mbridge.msdk.config.component.load.downloader.database.InterfaceC12809c
    /* JADX INFO: renamed from: a */
    public void mo35449a(C12808b c12808b, String str) {
        this.f34186b.post(new c(c12808b, str));
    }

    @Override // com.mbridge.msdk.config.component.load.downloader.database.InterfaceC12809c
    /* JADX INFO: renamed from: a */
    public void mo35450a(String str, String str2, C12808b c12808b) {
        this.f34186b.post(new d(c12808b, str, str2));
    }
}
