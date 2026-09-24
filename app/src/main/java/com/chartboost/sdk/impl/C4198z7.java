package com.chartboost.sdk.impl;

import android.net.Uri;
import com.chartboost.sdk.internal.Model.CBError;
import com.chartboost.sdk.internal.video.repository.exoplayer.VideoRepositoryDownloadService;
import com.google.android.exoplayer2.database.DatabaseProvider;
import com.google.android.exoplayer2.offline.Download;
import com.google.android.exoplayer2.offline.DownloadManager;
import com.google.android.exoplayer2.offline.DownloadRequest;
import com.google.android.exoplayer2.offline.DownloadService;
import com.google.android.exoplayer2.scheduler.Requirements;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.cache.Cache;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.z7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4198z7 implements InterfaceC4154x7, DownloadManager.Listener, C4194z3.b {

    /* JADX INFO: renamed from: a */
    public final C4176y7 f17104a;

    /* JADX INFO: renamed from: b */
    public DownloadManager f17105b;

    /* JADX INFO: renamed from: c */
    public DataSource.Factory f17106c;

    /* JADX INFO: renamed from: d */
    public InterfaceC3682c8 f17107d;

    /* JADX INFO: renamed from: e */
    public C3979p8 f17108e;

    /* JADX INFO: renamed from: f */
    public volatile List f17109f;

    /* JADX INFO: renamed from: g */
    public volatile Map f17110g;

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.z7$a */
    public static final class a extends Lambda implements Function1 {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C4087u6 f17111b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C4087u6 c4087u6) {
            super(1);
            this.f17111b = c4087u6;
        }

        /* JADX INFO: renamed from: a */
        public final void m20128a(C3924mk.a forEachListener) {
            Intrinsics.checkNotNullParameter(forEachListener, "$this$forEachListener");
            forEachListener.mo18439a(this.f17111b.m19573f(), this.f17111b.m19569b());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m20128a((C3924mk.a) obj);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.z7$b */
    public static final class b extends Lambda implements Function1 {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C4087u6 f17112b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ CBError f17113c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C4087u6 c4087u6, CBError cBError) {
            super(1);
            this.f17112b = c4087u6;
            this.f17113c = cBError;
        }

        /* JADX INFO: renamed from: a */
        public final void m20129a(C3924mk.a forEachListener) {
            Intrinsics.checkNotNullParameter(forEachListener, "$this$forEachListener");
            forEachListener.mo18441a(this.f17112b.m19573f(), this.f17112b.m19569b(), this.f17113c);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m20129a((C3924mk.a) obj);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.z7$c */
    public static final class c extends Lambda implements Function1 {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C4087u6 f17114b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C4087u6 c4087u6) {
            super(1);
            this.f17114b = c4087u6;
        }

        /* JADX INFO: renamed from: a */
        public final void m20130a(C3924mk.a forEachListener) {
            Intrinsics.checkNotNullParameter(forEachListener, "$this$forEachListener");
            forEachListener.mo18440a(this.f17114b.m19573f(), this.f17114b.m19569b(), 0L, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m20130a((C3924mk.a) obj);
            return Unit.INSTANCE;
        }
    }

    public C4198z7(C4176y7 dependencies) {
        Intrinsics.checkNotNullParameter(dependencies, "dependencies");
        this.f17104a = dependencies;
        this.f17109f = CollectionsKt.emptyList();
        this.f17110g = MapsKt.emptyMap();
    }

    public /* synthetic */ C4198z7(C4176y7 c4176y7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new C4176y7(null, null, null, null, null, null, null, null, null, null, 1023, null) : c4176y7);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m20113a(C4198z7 c4198z7, C4078tj c4078tj, EnumC4065t6 enumC4065t6, int i, Object obj) {
        if ((i & 1) != 0) {
            enumC4065t6 = EnumC4065t6.NONE;
        }
        c4198z7.m20121b(c4078tj, enumC4065t6);
    }

    /* JADX INFO: renamed from: a */
    public final CBError m20114a(Exception exc) {
        return exc instanceof IOException ? new CBError(CBError.Internal.NETWORK_FAILURE, AbstractC4044s7.m19390a(exc)) : new CBError(CBError.Internal.MISCELLANEOUS, AbstractC4044s7.m19390a(exc));
    }

    /* JADX INFO: renamed from: a */
    public final List m20115a(List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (m20119a((C4087u6) obj)) {
                arrayList.add(obj);
            }
        }
        m20123b(arrayList);
        return list;
    }

    @Override // com.chartboost.sdk.impl.InterfaceC4154x7
    /* JADX INFO: renamed from: a */
    public synchronized void mo19920a() {
        C4048sb.m19408a("initialize()", (Throwable) null, 2, (Object) null);
        this.f17104a.m20036i().invoke();
        mo19930d();
    }

    /* JADX INFO: renamed from: a */
    public final void m20116a(int i, String str, Function1 function1) {
        for (C3924mk.a aVar : this.f17109f) {
            Integer num = (Integer) this.f17110g.get(str);
            if (num == null || num.intValue() != i) {
                this.f17110g = MapsKt.plus(this.f17110g, TuplesKt.m43482to(str, Integer.valueOf(i)));
                function1.invoke(aVar);
            }
        }
    }

    @Override // com.chartboost.sdk.impl.InterfaceC4154x7
    /* JADX INFO: renamed from: a */
    public void mo19921a(C3924mk.a listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f17109f = CollectionsKt.plus((Collection<? extends C3924mk.a>) this.f17109f, listener);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC4154x7
    /* JADX INFO: renamed from: a */
    public void mo19922a(EnumC4065t6 currentDownloadStopReason) {
        C4087u6 c4087u6M19651a;
        Intrinsics.checkNotNullParameter(currentDownloadStopReason, "currentDownloadStopReason");
        List<Download> currentDownloads = mo19930d().getCurrentDownloads();
        Intrinsics.checkNotNullExpressionValue(currentDownloads, "getCurrentDownloads(...)");
        Download download = (Download) CollectionsKt.firstOrNull((List) currentDownloads);
        if (download == null || (c4087u6M19651a = AbstractC4109v6.m19651a(download)) == null) {
            return;
        }
        m20117a(c4087u6M19651a, currentDownloadStopReason);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC4154x7
    /* JADX INFO: renamed from: a */
    public void mo19923a(C4078tj asset) {
        Intrinsics.checkNotNullParameter(asset, "asset");
        C4048sb.m19408a("startDownload() - asset: " + asset, (Throwable) null, 2, (Object) null);
        m20120b(asset);
        m20124c(asset);
        m20113a(this, asset, null, 1, null);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC4154x7
    /* JADX INFO: renamed from: a */
    public void mo19924a(C4078tj asset, EnumC4065t6 stopReason) {
        Intrinsics.checkNotNullParameter(asset, "asset");
        Intrinsics.checkNotNullParameter(stopReason, "stopReason");
        C4048sb.m19408a("addDownload() - asset: " + asset + ", stopReason " + stopReason, (Throwable) null, 2, (Object) null);
        m20121b(asset, stopReason);
    }

    /* JADX INFO: renamed from: a */
    public final void m20117a(C4087u6 c4087u6, EnumC4065t6 enumC4065t6) {
        C4048sb.m19408a("Download.sendStopReason() - download " + c4087u6 + ", stopReason " + enumC4065t6, (Throwable) null, 2, (Object) null);
        try {
            DownloadService.sendSetStopReason(this.f17104a.m20030c(), VideoRepositoryDownloadService.class, c4087u6.m19569b(), enumC4065t6.m19459b(), false);
        } catch (Exception e) {
            C4048sb.m19410b("Error sending stop reason", e);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m20118a(C4087u6 c4087u6, Exception exc) {
        CBError cBErrorM20114a = m20114a(exc);
        C3851jg.m18281a("Video downloaded failed " + c4087u6.m19573f() + " with error " + cBErrorM20114a.getErrorDesc());
        m20116a(4, c4087u6.m19573f(), new b(c4087u6, cBErrorM20114a));
    }

    /* JADX INFO: renamed from: a */
    public final boolean m20119a(C4087u6 c4087u6) {
        return this.f17104a.m20037j().m19982a(c4087u6.m19572e());
    }

    @Override // com.chartboost.sdk.impl.InterfaceC4154x7
    /* JADX INFO: renamed from: a */
    public boolean mo19925a(String id) {
        Intrinsics.checkNotNullParameter(id, "id");
        C4087u6 c4087u6Mo19926b = mo19926b(id);
        if (c4087u6Mo19926b != null) {
            return c4087u6Mo19926b.m19571d() == 3 || c4087u6Mo19926b.m19571d() == 2;
        }
        return false;
    }

    @Override // com.chartboost.sdk.impl.InterfaceC4154x7
    /* JADX INFO: renamed from: b */
    public C4087u6 mo19926b(String id) {
        Intrinsics.checkNotNullParameter(id, "id");
        return AbstractC3647aj.m16843a(mo19930d(), id);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC4154x7
    /* JADX INFO: renamed from: b */
    public void mo19927b() {
        m20115a(AbstractC3647aj.m16845a(mo19930d()));
    }

    /* JADX INFO: renamed from: b */
    public final void m20120b(C4078tj c4078tj) {
        this.f17110g = MapsKt.minus((Map<? extends String, ? extends V>) this.f17110g, c4078tj.m19512g());
    }

    /* JADX INFO: renamed from: b */
    public final void m20121b(C4078tj c4078tj, EnumC4065t6 enumC4065t6) {
        C4048sb.m19408a("VideoAsset.addDownload() - videoAsset " + c4078tj + ", stopReason " + enumC4065t6, (Throwable) null, 2, (Object) null);
        if (StringsKt.isBlank(c4078tj.m19512g())) {
            return;
        }
        try {
            DownloadService.sendAddDownload(this.f17104a.m20030c(), VideoRepositoryDownloadService.class, new DownloadRequest.Builder(c4078tj.m19509d(), Uri.parse(c4078tj.m19512g())).build(), enumC4065t6.m19459b(), false);
        } catch (Exception e) {
            C4048sb.m19410b("Error sending add download", e);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m20122b(C4087u6 c4087u6) {
        C4048sb.m19408a("notifyDownloadCompleted() - download " + c4087u6 + ", listeners: " + this.f17109f, (Throwable) null, 2, (Object) null);
        String strM19573f = c4087u6.m19573f();
        StringBuilder sb = new StringBuilder("Video downloaded success ");
        sb.append(strM19573f);
        C3851jg.m18281a(sb.toString());
        m20116a(3, c4087u6.m19573f(), new a(c4087u6));
    }

    /* JADX INFO: renamed from: b */
    public final void m20123b(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            m20127e((C4087u6) it.next());
        }
    }

    @Override // com.chartboost.sdk.impl.InterfaceC4154x7
    /* JADX INFO: renamed from: c */
    public DataSource.Factory mo19928c() {
        DataSource.Factory factory = this.f17106c;
        if (factory != null) {
            return factory;
        }
        Intrinsics.throwUninitializedPropertyAccessException("cacheDataSourceFactory");
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final void m20124c(C4078tj c4078tj) {
        for (C4087u6 c4087u6 : AbstractC3647aj.m16845a(mo19930d())) {
            if (!Intrinsics.areEqual(c4087u6.m19569b(), c4078tj.m19509d())) {
                m20117a(c4087u6, EnumC4065t6.FORCED_OUT);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m20125c(C4087u6 c4087u6) throws IOException {
        C3979p8 c3979p8 = null;
        C4048sb.m19408a("notifyTempFileIsReady() - download " + c4087u6 + ", listeners: " + this.f17109f, (Throwable) null, 2, (Object) null);
        C3851jg.m18281a("Start downloading " + c4087u6.m19573f());
        C3979p8 c3979p9 = this.f17108e;
        if (c3979p9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("fakePrecacheFilesManager");
        } else {
            c3979p8 = c3979p9;
        }
        c3979p8.m19033e(c4087u6);
        m20116a(2, c4087u6.m19573f(), new c(c4087u6));
    }

    @Override // com.chartboost.sdk.impl.C4194z3.b
    /* JADX INFO: renamed from: c */
    public void mo20102c(String url) {
        Object next;
        Intrinsics.checkNotNullParameter(url, "url");
        Iterator it = AbstractC3647aj.m16845a(mo19930d()).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Intrinsics.areEqual(((C4087u6) next).m19573f(), url));
        C4087u6 c4087u6 = (C4087u6) next;
        if (c4087u6 != null) {
            m20127e(c4087u6);
        }
    }

    @Override // com.chartboost.sdk.impl.InterfaceC4154x7
    /* JADX INFO: renamed from: d */
    public float mo19929d(String id) {
        Intrinsics.checkNotNullParameter(id, "id");
        C4087u6 c4087u6Mo19926b = mo19926b(id);
        return (c4087u6Mo19926b != null ? c4087u6Mo19926b.m19570c() : 0.0f) / 100.0f;
    }

    @Override // com.chartboost.sdk.impl.InterfaceC4154x7
    /* JADX INFO: renamed from: d */
    public DownloadManager mo19930d() {
        C4198z7 c4198z7;
        if (this.f17105b == null) {
            DatabaseProvider databaseProvider = (DatabaseProvider) this.f17104a.m20031d().invoke(this.f17104a.m20030c());
            this.f17107d = (InterfaceC3682c8) this.f17104a.m20034g().invoke(this.f17104a.m20030c());
            Function4 function4M20029b = this.f17104a.m20029b();
            InterfaceC3682c8 interfaceC3682c8 = this.f17107d;
            if (interfaceC3682c8 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("fileCaching");
                interfaceC3682c8 = null;
            }
            Cache cache = (Cache) function4M20029b.invoke(interfaceC3682c8, this.f17104a.m20037j(), databaseProvider, this);
            this.f17106c = (DataSource.Factory) this.f17104a.m20028a().invoke(cache, this.f17104a.m20035h());
            Function1 function1M20033f = this.f17104a.m20033f();
            InterfaceC3682c8 interfaceC3682c9 = this.f17107d;
            if (interfaceC3682c9 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("fileCaching");
                interfaceC3682c9 = null;
            }
            this.f17108e = (C3979p8) function1M20033f.invoke(interfaceC3682c9);
            c4198z7 = this;
            c4198z7.f17105b = (DownloadManager) this.f17104a.m20032e().invoke(this.f17104a.m20030c(), databaseProvider, cache, this.f17104a.m20035h(), c4198z7);
        } else {
            c4198z7 = this;
        }
        DownloadManager downloadManager = c4198z7.f17105b;
        if (downloadManager != null) {
            return downloadManager;
        }
        Intrinsics.throwUninitializedPropertyAccessException("downloadManager");
        return null;
    }

    /* JADX INFO: renamed from: d */
    public final void m20126d(C4087u6 c4087u6) {
        C3979p8 c3979p8 = null;
        C4048sb.m19408a("downloadRemoved() - download " + c4087u6 + ", listeners: " + this.f17109f, (Throwable) null, 2, (Object) null);
        C3979p8 c3979p9 = this.f17108e;
        if (c3979p9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("fakePrecacheFilesManager");
        } else {
            c3979p8 = c3979p9;
        }
        c3979p8.m19032d(c4087u6);
        this.f17110g = MapsKt.minus((Map<? extends String, ? extends V>) this.f17110g, c4087u6.m19573f());
    }

    /* JADX INFO: renamed from: e */
    public final void m20127e(C4087u6 c4087u6) {
        try {
            DownloadService.sendRemoveDownload(this.f17104a.m20030c(), VideoRepositoryDownloadService.class, c4087u6.m19569b(), false);
            C3979p8 c3979p8 = this.f17108e;
            if (c3979p8 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("fakePrecacheFilesManager");
                c3979p8 = null;
            }
            c3979p8.m19032d(c4087u6);
        } catch (Exception e) {
            C4048sb.m19410b("Error sending remove download", e);
        }
    }

    @Override // com.google.android.exoplayer2.offline.DownloadManager.Listener
    public void onDownloadChanged(DownloadManager downloadManager, Download download, Exception exc) throws IOException {
        Intrinsics.checkNotNullParameter(downloadManager, "downloadManager");
        Intrinsics.checkNotNullParameter(download, "download");
        C3979p8 c3979p8 = null;
        C4048sb.m19408a("onDownloadChanged() - state " + AbstractC4109v6.m19653a(download.state) + ", finalException " + exc, (Throwable) null, 2, (Object) null);
        int i = download.state;
        if (i == 0 || i == 1) {
            C3979p8 c3979p9 = this.f17108e;
            if (c3979p9 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("fakePrecacheFilesManager");
            } else {
                c3979p8 = c3979p9;
            }
            c3979p8.m19031c(AbstractC4109v6.m19651a(download));
            return;
        }
        if (i == 2) {
            m20125c(AbstractC4109v6.m19651a(download));
            return;
        }
        if (i == 3) {
            m20122b(AbstractC4109v6.m19651a(download));
        } else if (i == 4) {
            m20118a(AbstractC4109v6.m19651a(download), exc);
        } else {
            if (i != 5) {
                return;
            }
            m20126d(AbstractC4109v6.m19651a(download));
        }
    }

    @Override // com.google.android.exoplayer2.offline.DownloadManager.Listener
    public /* synthetic */ void onDownloadRemoved(DownloadManager downloadManager, Download download) {
        DownloadManager.Listener.CC.$default$onDownloadRemoved(this, downloadManager, download);
    }

    @Override // com.google.android.exoplayer2.offline.DownloadManager.Listener
    public /* synthetic */ void onDownloadsPausedChanged(DownloadManager downloadManager, boolean z) {
        DownloadManager.Listener.CC.$default$onDownloadsPausedChanged(this, downloadManager, z);
    }

    @Override // com.google.android.exoplayer2.offline.DownloadManager.Listener
    public /* synthetic */ void onIdle(DownloadManager downloadManager) {
        DownloadManager.Listener.CC.$default$onIdle(this, downloadManager);
    }

    @Override // com.google.android.exoplayer2.offline.DownloadManager.Listener
    public /* synthetic */ void onInitialized(DownloadManager downloadManager) {
        DownloadManager.Listener.CC.$default$onInitialized(this, downloadManager);
    }

    @Override // com.google.android.exoplayer2.offline.DownloadManager.Listener
    public /* synthetic */ void onRequirementsStateChanged(DownloadManager downloadManager, Requirements requirements, int i) {
        DownloadManager.Listener.CC.$default$onRequirementsStateChanged(this, downloadManager, requirements, i);
    }

    @Override // com.google.android.exoplayer2.offline.DownloadManager.Listener
    public /* synthetic */ void onWaitingForRequirementsChanged(DownloadManager downloadManager, boolean z) {
        DownloadManager.Listener.CC.$default$onWaitingForRequirementsChanged(this, downloadManager, z);
    }
}
