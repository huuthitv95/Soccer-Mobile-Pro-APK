package com.chartboost.sdk.impl;

import android.content.Context;
import androidx.media3.common.PlaybackException;
import androidx.media3.exoplayer.ExoPlayer;
import java.io.File;
import java.net.URL;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.oe */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3963oe {

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.oe$a */
    public static final class a extends AbstractC3963oe {

        /* JADX INFO: renamed from: a */
        public final Context f15680a;

        /* JADX INFO: renamed from: b */
        public final URL f15681b;

        /* JADX INFO: renamed from: c */
        public final InterfaceC4153x6 f15682c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, URL url, InterfaceC4153x6 cache) {
            super(null);
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(cache, "cache");
            this.f15680a = context;
            this.f15681b = url;
            this.f15682c = cache;
        }

        /* JADX INFO: renamed from: a */
        public final InterfaceC4153x6 m18924a() {
            return this.f15682c;
        }

        /* JADX INFO: renamed from: b */
        public final Context m18925b() {
            return this.f15680a;
        }

        /* JADX INFO: renamed from: c */
        public final URL m18926c() {
            return this.f15681b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.areEqual(this.f15680a, aVar.f15680a) && Intrinsics.areEqual(this.f15681b, aVar.f15681b) && Intrinsics.areEqual(this.f15682c, aVar.f15682c);
        }

        public int hashCode() {
            return (((this.f15680a.hashCode() * 31) + this.f15681b.hashCode()) * 31) + this.f15682c.hashCode();
        }

        public String toString() {
            return "Load(context=" + this.f15680a + ", url=" + this.f15681b + ", cache=" + this.f15682c + ")";
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.oe$b */
    public static final class b extends AbstractC3963oe {

        /* JADX INFO: renamed from: a */
        public final File f15683a;

        /* JADX INFO: renamed from: b */
        public final ExoPlayer f15684b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(File file, ExoPlayer player) {
            super(null);
            Intrinsics.checkNotNullParameter(file, "file");
            Intrinsics.checkNotNullParameter(player, "player");
            this.f15683a = file;
            this.f15684b = player;
        }

        /* JADX INFO: renamed from: a */
        public final File m18927a() {
            return this.f15683a;
        }

        /* JADX INFO: renamed from: b */
        public final ExoPlayer m18928b() {
            return this.f15684b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Intrinsics.areEqual(this.f15683a, bVar.f15683a) && Intrinsics.areEqual(this.f15684b, bVar.f15684b);
        }

        public int hashCode() {
            return (this.f15683a.hashCode() * 31) + this.f15684b.hashCode();
        }

        public String toString() {
            return "OnAssetCached(file=" + this.f15683a + ", player=" + this.f15684b + ")";
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.oe$c */
    public static final class c extends AbstractC3963oe {

        /* JADX INFO: renamed from: a */
        public static final c f15685a = new c();

        public c() {
            super(null);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return 2063644930;
        }

        public String toString() {
            return "OnAssetEvicted";
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.oe$d */
    public static final class d extends AbstractC3963oe {

        /* JADX INFO: renamed from: a */
        public static final d f15686a = new d();

        public d() {
            super(null);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return 1259040565;
        }

        public String toString() {
            return "OnPlaybackEnded";
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.oe$e */
    public static final class e extends AbstractC3963oe {

        /* JADX INFO: renamed from: a */
        public final PlaybackException f15687a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(PlaybackException error) {
            super(null);
            Intrinsics.checkNotNullParameter(error, "error");
            this.f15687a = error;
        }

        /* JADX INFO: renamed from: a */
        public final PlaybackException m18929a() {
            return this.f15687a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && Intrinsics.areEqual(this.f15687a, ((e) obj).f15687a);
        }

        public int hashCode() {
            return this.f15687a.hashCode();
        }

        public String toString() {
            return "OnPlayerError(error=" + this.f15687a + ")";
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.oe$f */
    public static final class f extends AbstractC3963oe {

        /* JADX INFO: renamed from: a */
        public final ExoPlayer f15688a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(ExoPlayer player) {
            super(null);
            Intrinsics.checkNotNullParameter(player, "player");
            this.f15688a = player;
        }

        /* JADX INFO: renamed from: a */
        public final ExoPlayer m18930a() {
            return this.f15688a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && Intrinsics.areEqual(this.f15688a, ((f) obj).f15688a);
        }

        public int hashCode() {
            return this.f15688a.hashCode();
        }

        public String toString() {
            return "OnPlayerReady(player=" + this.f15688a + ")";
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.oe$g */
    public static final class g extends AbstractC3963oe {

        /* JADX INFO: renamed from: a */
        public static final g f15689a = new g();

        public g() {
            super(null);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return -1967296085;
        }

        public String toString() {
            return "Pause";
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.oe$h */
    public static final class h extends AbstractC3963oe {

        /* JADX INFO: renamed from: a */
        public static final h f15690a = new h();

        public h() {
            super(null);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return 1322022111;
        }

        public String toString() {
            return "Play";
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.oe$i */
    public static final class i extends AbstractC3963oe {

        /* JADX INFO: renamed from: a */
        public static final i f15691a = new i();

        public i() {
            super(null);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return 1094867580;
        }

        public String toString() {
            return "Release";
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.oe$j */
    public static final class j extends AbstractC3963oe {

        /* JADX INFO: renamed from: a */
        public final float f15692a;

        public j(float f) {
            super(null);
            this.f15692a = f;
        }

        /* JADX INFO: renamed from: a */
        public final float m18931a() {
            return this.f15692a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof j) && Float.compare(this.f15692a, ((j) obj).f15692a) == 0;
        }

        public int hashCode() {
            return Float.floatToIntBits(this.f15692a);
        }

        public String toString() {
            return "SetVolume(volume=" + this.f15692a + ")";
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.oe$k */
    public static final class k extends AbstractC3963oe {

        /* JADX INFO: renamed from: a */
        public final EnumC3737eh f15693a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(EnumC3737eh reason) {
            super(null);
            Intrinsics.checkNotNullParameter(reason, "reason");
            this.f15693a = reason;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof k) && this.f15693a == ((k) obj).f15693a;
        }

        public int hashCode() {
            return this.f15693a.hashCode();
        }

        public String toString() {
            return "Stop(reason=" + this.f15693a + ")";
        }
    }

    public AbstractC3963oe() {
    }

    public /* synthetic */ AbstractC3963oe(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
