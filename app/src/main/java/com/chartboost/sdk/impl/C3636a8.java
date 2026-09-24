package com.chartboost.sdk.impl;

import android.content.Context;
import com.google.android.exoplayer2.ExoPlayer;
import com.google.android.exoplayer2.LoadControl;
import com.google.android.exoplayer2.source.MediaSource;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3636a8 {

    /* JADX INFO: renamed from: a */
    public final Function0 f13453a;

    /* JADX INFO: renamed from: b */
    public final Function0 f13454b;

    /* JADX INFO: renamed from: c */
    public final Context f13455c;

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.a8$a */
    public static final class a extends Lambda implements Function0 {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ InterfaceC4154x7 f13456b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC4154x7 interfaceC4154x7) {
            super(0);
            this.f13456b = interfaceC4154x7;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MediaSource.Factory invoke() {
            return AbstractC3749f6.m17627a(this.f13456b.mo19928c());
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.a8$b */
    public static final class b extends Lambda implements Function0 {

        /* JADX INFO: renamed from: b */
        public static final b f13457b = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final LoadControl invoke() {
            return AbstractC3749f6.m17621a(0, 0, 3, (Object) null);
        }
    }

    public C3636a8(Context context, InterfaceC4154x7 downloadManager, Function0 mediaSourceFactory, Function0 loadControlFactory) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(downloadManager, "downloadManager");
        Intrinsics.checkNotNullParameter(mediaSourceFactory, "mediaSourceFactory");
        Intrinsics.checkNotNullParameter(loadControlFactory, "loadControlFactory");
        this.f13453a = mediaSourceFactory;
        this.f13454b = loadControlFactory;
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        this.f13455c = applicationContext;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C3636a8(Context context, InterfaceC4154x7 interfaceC4154x7, Function0 function0, Function0 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        interfaceC4154x7 = (i & 2) != 0 ? C3678c4.f13658b.mo17019a().mo18990d() : interfaceC4154x7;
        this(context, interfaceC4154x7, (i & 4) != 0 ? new a(interfaceC4154x7) : function0, (i & 8) != 0 ? b.f13457b : function1);
    }

    /* JADX INFO: renamed from: a */
    public final ExoPlayer m16806a() {
        ExoPlayer exoPlayerBuild = new ExoPlayer.Builder(this.f13455c).setMediaSourceFactory((MediaSource.Factory) this.f13453a.invoke()).setLoadControl((LoadControl) this.f13454b.invoke()).build();
        Intrinsics.checkNotNullExpressionValue(exoPlayerBuild, "build(...)");
        return exoPlayerBuild;
    }
}
