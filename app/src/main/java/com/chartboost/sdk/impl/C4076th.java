package com.chartboost.sdk.impl;

import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.th */
/* JADX INFO: loaded from: classes3.dex */
public final class C4076th {

    /* JADX INFO: renamed from: a */
    public final String f16389a;

    /* JADX INFO: renamed from: b */
    public final String f16390b;

    /* JADX INFO: renamed from: c */
    public final String f16391c;

    /* JADX INFO: renamed from: d */
    public final String f16392d;

    /* JADX INFO: renamed from: e */
    public final String f16393e;

    /* JADX INFO: renamed from: f */
    public final String f16394f;

    /* JADX INFO: renamed from: g */
    public final String f16395g;

    /* JADX INFO: renamed from: h */
    public final a f16396h;

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.th$a */
    @Metadata(m43474d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u001f2\u00020\u0001:\u0002\b\u0017B\u001f\u0012\n\u0010\u0016\u001a\u00060\rj\u0002`\u0014\u0012\n\u0010\u0018\u001a\u00060\rj\u0002`\u0014¢\u0006\u0004\b\u0019\u0010\u001aB3\b\u0011\u0012\u0006\u0010\u001b\u001a\u00020\r\u0012\n\u0010\u0016\u001a\u00060\rj\u0002`\u0014\u0012\n\u0010\u0018\u001a\u00060\rj\u0002`\u0014\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b\u0019\u0010\u001eJ(\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÁ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0016\u001a\u00060\rj\u0002`\u00148\u0006¢\u0006\f\n\u0004\b\b\u0010\u0015\u001a\u0004\b\b\u0010\u000fR\u001b\u0010\u0018\u001a\u00060\rj\u0002`\u00148\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0017\u0010\u000f¨\u0006 "}, m43475d2 = {"Lcom/chartboost/sdk/impl/th$a;", "", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "a", "(Lcom/chartboost/sdk/impl/th$a;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/chartboost/sdk/tracking/Pixels;", "I", "height", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "width", "<init>", "(II)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IIILkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Companion", "ChartboostMonetization-9.11.1_productionRelease"}, m43476k = 1, m43477mv = {1, 9, 0})
    @Serializable
    public static final /* data */ class a {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        public final int height;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public final int width;

        /* JADX INFO: renamed from: com.chartboost.sdk.impl.th$a$a, reason: collision with other inner class name */
        public static final class C15483a implements GeneratedSerializer {

            /* JADX INFO: renamed from: a */
            public static final C15483a f16399a;

            /* JADX INFO: renamed from: b */
            public static final /* synthetic */ PluginGeneratedSerialDescriptor f16400b;

            static {
                C15483a c15483a = new C15483a();
                f16399a = c15483a;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.chartboost.sdk.tracking.TrackAd.AdSize", c15483a, 2);
                pluginGeneratedSerialDescriptor.addElement("height", false);
                pluginGeneratedSerialDescriptor.addElement("width", false);
                f16400b = pluginGeneratedSerialDescriptor;
            }

            @Override // kotlinx.serialization.DeserializationStrategy
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public a deserialize(Decoder decoder) {
                int iDecodeIntElement;
                int iDecodeIntElement2;
                int i;
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                SerialDescriptor descriptor = getDescriptor();
                CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(descriptor);
                if (compositeDecoderBeginStructure.decodeSequentially()) {
                    iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(descriptor, 0);
                    iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(descriptor, 1);
                    i = 3;
                } else {
                    boolean z = true;
                    iDecodeIntElement = 0;
                    int iDecodeIntElement3 = 0;
                    int i2 = 0;
                    while (z) {
                        int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(descriptor);
                        if (iDecodeElementIndex == -1) {
                            z = false;
                        } else if (iDecodeElementIndex == 0) {
                            iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(descriptor, 0);
                            i2 |= 1;
                        } else {
                            if (iDecodeElementIndex != 1) {
                                throw new UnknownFieldException(iDecodeElementIndex);
                            }
                            iDecodeIntElement3 = compositeDecoderBeginStructure.decodeIntElement(descriptor, 1);
                            i2 |= 2;
                        }
                    }
                    iDecodeIntElement2 = iDecodeIntElement3;
                    i = i2;
                }
                compositeDecoderBeginStructure.endStructure(descriptor);
                return new a(i, iDecodeIntElement, iDecodeIntElement2, null);
            }

            @Override // kotlinx.serialization.SerializationStrategy
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public void serialize(Encoder encoder, a value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                SerialDescriptor descriptor = getDescriptor();
                CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(descriptor);
                a.m19497a(value, compositeEncoderBeginStructure, descriptor);
                compositeEncoderBeginStructure.endStructure(descriptor);
            }

            @Override // kotlinx.serialization.internal.GeneratedSerializer
            public KSerializer[] childSerializers() {
                IntSerializer intSerializer = IntSerializer.INSTANCE;
                return new KSerializer[]{intSerializer, intSerializer};
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
            public SerialDescriptor getDescriptor() {
                return f16400b;
            }

            @Override // kotlinx.serialization.internal.GeneratedSerializer
            public KSerializer[] typeParametersSerializers() {
                return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
            }
        }

        /* JADX INFO: renamed from: com.chartboost.sdk.impl.th$a$b, reason: from kotlin metadata */
        public static final class Companion {
            public Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<a> serializer() {
                return C15483a.f16399a;
            }
        }

        public a(int i, int i2) {
            this.height = i;
            this.width = i2;
        }

        public /* synthetic */ a(int i, int i2, int i3, SerializationConstructorMarker serializationConstructorMarker) {
            if (3 != (i & 3)) {
                PluginExceptionsKt.throwMissingFieldException(i, 3, C15483a.f16399a.getDescriptor());
            }
            this.height = i2;
            this.width = i3;
        }

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ void m19497a(a self, CompositeEncoder output, SerialDescriptor serialDesc) {
            output.encodeIntElement(serialDesc, 0, self.height);
            output.encodeIntElement(serialDesc, 1, self.width);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getHeight() {
            return this.height;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final int getWidth() {
            return this.width;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return this.height == aVar.height && this.width == aVar.width;
        }

        public int hashCode() {
            return (this.height * 31) + this.width;
        }

        public String toString() {
            return "AdSize(height=" + this.height + ", width=" + this.width + ")";
        }
    }

    public C4076th(String location, String adType, String str, String adCreativeId, String adCreativeType, String adMarkup, String templateUrl, a aVar) {
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(adType, "adType");
        Intrinsics.checkNotNullParameter(adCreativeId, "adCreativeId");
        Intrinsics.checkNotNullParameter(adCreativeType, "adCreativeType");
        Intrinsics.checkNotNullParameter(adMarkup, "adMarkup");
        Intrinsics.checkNotNullParameter(templateUrl, "templateUrl");
        this.f16389a = location;
        this.f16390b = adType;
        this.f16391c = str;
        this.f16392d = adCreativeId;
        this.f16393e = adCreativeType;
        this.f16394f = adMarkup;
        this.f16395g = templateUrl;
        this.f16396h = aVar;
    }

    public /* synthetic */ C4076th(String str, String str2, String str3, String str4, String str5, String str6, String str7, a aVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? null : aVar);
    }

    /* JADX INFO: renamed from: a */
    public final String m19490a() {
        return this.f16392d;
    }

    /* JADX INFO: renamed from: b */
    public final String m19491b() {
        return this.f16391c;
    }

    /* JADX INFO: renamed from: c */
    public final a m19492c() {
        return this.f16396h;
    }

    /* JADX INFO: renamed from: d */
    public final String m19493d() {
        return this.f16390b;
    }

    /* JADX INFO: renamed from: e */
    public final String m19494e() {
        return this.f16389a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4076th)) {
            return false;
        }
        C4076th c4076th = (C4076th) obj;
        return Intrinsics.areEqual(this.f16389a, c4076th.f16389a) && Intrinsics.areEqual(this.f16390b, c4076th.f16390b) && Intrinsics.areEqual(this.f16391c, c4076th.f16391c) && Intrinsics.areEqual(this.f16392d, c4076th.f16392d) && Intrinsics.areEqual(this.f16393e, c4076th.f16393e) && Intrinsics.areEqual(this.f16394f, c4076th.f16394f) && Intrinsics.areEqual(this.f16395g, c4076th.f16395g) && Intrinsics.areEqual(this.f16396h, c4076th.f16396h);
    }

    /* JADX INFO: renamed from: f */
    public final String m19495f() {
        String str = this.f16391c;
        if (str == null) {
            return null;
        }
        String strSubstring = str.substring(0, RangesKt.coerceAtMost(str.length(), 20));
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    /* JADX INFO: renamed from: g */
    public final String m19496g() {
        return this.f16395g;
    }

    public int hashCode() {
        int iHashCode = ((this.f16389a.hashCode() * 31) + this.f16390b.hashCode()) * 31;
        String str = this.f16391c;
        int iHashCode2 = (((((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f16392d.hashCode()) * 31) + this.f16393e.hashCode()) * 31) + this.f16394f.hashCode()) * 31) + this.f16395g.hashCode()) * 31;
        a aVar = this.f16396h;
        return iHashCode2 + (aVar != null ? aVar.hashCode() : 0);
    }

    public String toString() {
        return "TrackAd: location: " + this.f16389a + " adType: " + this.f16390b + " adImpressionId: " + m19495f() + " adCreativeId: " + this.f16392d + " adCreativeType: " + this.f16393e + " adMarkup: " + this.f16394f + " templateUrl: " + this.f16395g;
    }
}
