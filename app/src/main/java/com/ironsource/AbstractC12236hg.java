package com.ironsource;

import com.unity3d.mediation.LevelPlay;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.hg */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC12236hg {

    /* JADX INFO: renamed from: com.ironsource.hg$a */
    public static final class a extends AbstractC12236hg {

        /* JADX INFO: renamed from: a */
        private final LevelPlay.AdFormat f30508a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(LevelPlay.AdFormat adFormat) {
            super(null);
            Intrinsics.checkNotNullParameter(adFormat, "adFormat");
            this.f30508a = adFormat;
        }

        /* JADX INFO: renamed from: a */
        public final LevelPlay.AdFormat m31649a() {
            return this.f30508a;
        }

        /* JADX INFO: renamed from: b */
        public final LevelPlay.AdFormat m31650b() {
            return this.f30508a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f30508a == ((a) obj).f30508a;
        }

        public int hashCode() {
            return this.f30508a.hashCode();
        }

        public String toString() {
            return "EmptyPlacementsArray(adFormat=" + this.f30508a + ")";
        }

        /* JADX INFO: renamed from: a */
        public final a m31648a(LevelPlay.AdFormat adFormat) {
            Intrinsics.checkNotNullParameter(adFormat, "adFormat");
            return new a(adFormat);
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ a m31647a(a aVar, LevelPlay.AdFormat adFormat, int i, Object obj) {
            if ((i & 1) != 0) {
                adFormat = aVar.f30508a;
            }
            return aVar.m31648a(adFormat);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.hg$b */
    public static final class b extends AbstractC12236hg {

        /* JADX INFO: renamed from: a */
        private final LevelPlay.AdFormat f30509a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(LevelPlay.AdFormat adFormat) {
            super(null);
            Intrinsics.checkNotNullParameter(adFormat, "adFormat");
            this.f30509a = adFormat;
        }

        /* JADX INFO: renamed from: a */
        public final LevelPlay.AdFormat m31653a() {
            return this.f30509a;
        }

        /* JADX INFO: renamed from: b */
        public final LevelPlay.AdFormat m31654b() {
            return this.f30509a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.f30509a == ((b) obj).f30509a;
        }

        public int hashCode() {
            return this.f30509a.hashCode();
        }

        public String toString() {
            return "MissingPlacements(adFormat=" + this.f30509a + ")";
        }

        /* JADX INFO: renamed from: a */
        public final b m31652a(LevelPlay.AdFormat adFormat) {
            Intrinsics.checkNotNullParameter(adFormat, "adFormat");
            return new b(adFormat);
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ b m31651a(b bVar, LevelPlay.AdFormat adFormat, int i, Object obj) {
            if ((i & 1) != 0) {
                adFormat = bVar.f30509a;
            }
            return bVar.m31652a(adFormat);
        }
    }

    public /* synthetic */ AbstractC12236hg(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC12236hg() {
    }
}
