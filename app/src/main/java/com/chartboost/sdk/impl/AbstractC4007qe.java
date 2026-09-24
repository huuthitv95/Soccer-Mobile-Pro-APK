package com.chartboost.sdk.impl;

import androidx.media3.exoplayer.ExoPlayer;
import java.net.URL;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.qe */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC4007qe {

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.qe$a */
    public static final class a extends AbstractC4007qe {

        /* JADX INFO: renamed from: a */
        public final Throwable f15932a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Throwable error) {
            super(null);
            Intrinsics.checkNotNullParameter(error, "error");
            this.f15932a = error;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && Intrinsics.areEqual(this.f15932a, ((a) obj).f15932a);
        }

        public int hashCode() {
            return this.f15932a.hashCode();
        }

        public String toString() {
            return "Error(error=" + this.f15932a + ")";
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.qe$b */
    public static final class b extends AbstractC4007qe {

        /* JADX INFO: renamed from: a */
        public static final b f15933a = new b();

        public b() {
            super(null);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return 109869544;
        }

        public String toString() {
            return "Idle";
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.qe$c */
    /* JADX INFO: loaded from: classes9.dex */
    public static final class c extends AbstractC4007qe {

        /* JADX INFO: renamed from: a */
        public final URL f15934a;

        /* JADX INFO: renamed from: b */
        public final ExoPlayer f15935b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(URL url, ExoPlayer player) {
            super(null);
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(player, "player");
            this.f15934a = url;
            this.f15935b = player;
        }

        @Override // com.chartboost.sdk.impl.AbstractC4007qe
        /* JADX INFO: renamed from: a */
        public ExoPlayer mo19170a() {
            return this.f15935b;
        }

        /* JADX INFO: renamed from: b */
        public final URL m19171b() {
            return this.f15934a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return Intrinsics.areEqual(this.f15934a, cVar.f15934a) && Intrinsics.areEqual(this.f15935b, cVar.f15935b);
        }

        public int hashCode() {
            return (this.f15934a.hashCode() * 31) + this.f15935b.hashCode();
        }

        public String toString() {
            return "Loading(url=" + this.f15934a + ", player=" + this.f15935b + ")";
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.qe$d */
    public static final class d extends AbstractC4007qe {

        /* JADX INFO: renamed from: a */
        public final URL f15936a;

        /* JADX INFO: renamed from: b */
        public final ExoPlayer f15937b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(URL url, ExoPlayer player) {
            super(null);
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(player, "player");
            this.f15936a = url;
            this.f15937b = player;
        }

        @Override // com.chartboost.sdk.impl.AbstractC4007qe
        /* JADX INFO: renamed from: a */
        public ExoPlayer mo19170a() {
            return this.f15937b;
        }

        /* JADX INFO: renamed from: b */
        public final URL m19172b() {
            return this.f15936a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return Intrinsics.areEqual(this.f15936a, dVar.f15936a) && Intrinsics.areEqual(this.f15937b, dVar.f15937b);
        }

        public int hashCode() {
            return (this.f15936a.hashCode() * 31) + this.f15937b.hashCode();
        }

        public String toString() {
            return "Paused(url=" + this.f15936a + ", player=" + this.f15937b + ")";
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.qe$e */
    public static final class e extends AbstractC4007qe {

        /* JADX INFO: renamed from: a */
        public final URL f15938a;

        /* JADX INFO: renamed from: b */
        public final ExoPlayer f15939b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(URL url, ExoPlayer player) {
            super(null);
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(player, "player");
            this.f15938a = url;
            this.f15939b = player;
        }

        @Override // com.chartboost.sdk.impl.AbstractC4007qe
        /* JADX INFO: renamed from: a */
        public ExoPlayer mo19170a() {
            return this.f15939b;
        }

        /* JADX INFO: renamed from: b */
        public final URL m19173b() {
            return this.f15938a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return Intrinsics.areEqual(this.f15938a, eVar.f15938a) && Intrinsics.areEqual(this.f15939b, eVar.f15939b);
        }

        public int hashCode() {
            return (this.f15938a.hashCode() * 31) + this.f15939b.hashCode();
        }

        public String toString() {
            return "Playing(url=" + this.f15938a + ", player=" + this.f15939b + ")";
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.qe$f */
    public static final class f extends AbstractC4007qe {

        /* JADX INFO: renamed from: a */
        public final URL f15940a;

        /* JADX INFO: renamed from: b */
        public final ExoPlayer f15941b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(URL url, ExoPlayer player) {
            super(null);
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(player, "player");
            this.f15940a = url;
            this.f15941b = player;
        }

        @Override // com.chartboost.sdk.impl.AbstractC4007qe
        /* JADX INFO: renamed from: a */
        public ExoPlayer mo19170a() {
            return this.f15941b;
        }

        /* JADX INFO: renamed from: b */
        public final URL m19174b() {
            return this.f15940a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return Intrinsics.areEqual(this.f15940a, fVar.f15940a) && Intrinsics.areEqual(this.f15941b, fVar.f15941b);
        }

        public int hashCode() {
            return (this.f15940a.hashCode() * 31) + this.f15941b.hashCode();
        }

        public String toString() {
            return "Ready(url=" + this.f15940a + ", player=" + this.f15941b + ")";
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.qe$g */
    public static final class g extends AbstractC4007qe {

        /* JADX INFO: renamed from: a */
        public static final g f15942a = new g();

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
            return 1919674705;
        }

        public String toString() {
            return "Released";
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.qe$h */
    public static final class h extends AbstractC4007qe {

        /* JADX INFO: renamed from: a */
        public final URL f15943a;

        /* JADX INFO: renamed from: b */
        public final ExoPlayer f15944b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(URL url, ExoPlayer player) {
            super(null);
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(player, "player");
            this.f15943a = url;
            this.f15944b = player;
        }

        @Override // com.chartboost.sdk.impl.AbstractC4007qe
        /* JADX INFO: renamed from: a */
        public ExoPlayer mo19170a() {
            return this.f15944b;
        }

        /* JADX INFO: renamed from: b */
        public final URL m19175b() {
            return this.f15943a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return Intrinsics.areEqual(this.f15943a, hVar.f15943a) && Intrinsics.areEqual(this.f15944b, hVar.f15944b);
        }

        public int hashCode() {
            return (this.f15943a.hashCode() * 31) + this.f15944b.hashCode();
        }

        public String toString() {
            return "Stopped(url=" + this.f15943a + ", player=" + this.f15944b + ")";
        }
    }

    public AbstractC4007qe() {
    }

    public /* synthetic */ AbstractC4007qe(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: renamed from: a */
    public ExoPlayer mo19170a() {
        return null;
    }
}
