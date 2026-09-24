package com.vungle.ads.internal.model;

import com.ironsource.C11540L6;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.FloatSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: compiled from: DeviceNode.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m43474d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tHÖ\u0001¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eHÖ\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, m43475d2 = {"com/vungle/ads/internal/model/DeviceNode.VungleExt.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/vungle/ads/internal/model/DeviceNode$VungleExt;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "vungle-ads_release"}, m43476k = 1, m43477mv = {1, 7, 1}, m43479xi = 48)
@Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
public final class DeviceNode$VungleExt$$serializer implements GeneratedSerializer<DeviceNode.VungleExt> {
    public static final DeviceNode$VungleExt$$serializer INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        DeviceNode$VungleExt$$serializer deviceNode$VungleExt$$serializer = new DeviceNode$VungleExt$$serializer();
        INSTANCE = deviceNode$VungleExt$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.vungle.ads.internal.model.DeviceNode.VungleExt", deviceNode$VungleExt$$serializer, 23);
        pluginGeneratedSerialDescriptor.addElement("is_google_play_services_available", true);
        pluginGeneratedSerialDescriptor.addElement("app_set_id", true);
        pluginGeneratedSerialDescriptor.addElement("app_set_id_scope", true);
        pluginGeneratedSerialDescriptor.addElement("battery_level", true);
        pluginGeneratedSerialDescriptor.addElement("battery_state", true);
        pluginGeneratedSerialDescriptor.addElement("battery_saver_enabled", true);
        pluginGeneratedSerialDescriptor.addElement("connection_type", true);
        pluginGeneratedSerialDescriptor.addElement("connection_type_detail", true);
        pluginGeneratedSerialDescriptor.addElement("locale", true);
        pluginGeneratedSerialDescriptor.addElement("language", true);
        pluginGeneratedSerialDescriptor.addElement("time_zone", true);
        pluginGeneratedSerialDescriptor.addElement("volume_level", true);
        pluginGeneratedSerialDescriptor.addElement("sound_enabled", true);
        pluginGeneratedSerialDescriptor.addElement("is_tv", true);
        pluginGeneratedSerialDescriptor.addElement("sd_card_available", true);
        pluginGeneratedSerialDescriptor.addElement("is_sideload_enabled", true);
        pluginGeneratedSerialDescriptor.addElement(C11540L6.f24947V0, true);
        pluginGeneratedSerialDescriptor.addElement("amazon_advertising_id", true);
        pluginGeneratedSerialDescriptor.addElement("sit", true);
        pluginGeneratedSerialDescriptor.addElement("oit", true);
        pluginGeneratedSerialDescriptor.addElement("ort", true);
        pluginGeneratedSerialDescriptor.addElement("obt", true);
        pluginGeneratedSerialDescriptor.addElement("gp_version", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private DeviceNode$VungleExt$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] childSerializers() {
        return new KSerializer[]{BooleanSerializer.INSTANCE, BuiltinSerializersKt.getNullable(StringSerializer.INSTANCE), BuiltinSerializersKt.getNullable(IntSerializer.INSTANCE), FloatSerializer.INSTANCE, BuiltinSerializersKt.getNullable(StringSerializer.INSTANCE), IntSerializer.INSTANCE, BuiltinSerializersKt.getNullable(StringSerializer.INSTANCE), BuiltinSerializersKt.getNullable(StringSerializer.INSTANCE), BuiltinSerializersKt.getNullable(StringSerializer.INSTANCE), BuiltinSerializersKt.getNullable(StringSerializer.INSTANCE), BuiltinSerializersKt.getNullable(StringSerializer.INSTANCE), FloatSerializer.INSTANCE, IntSerializer.INSTANCE, BooleanSerializer.INSTANCE, IntSerializer.INSTANCE, BooleanSerializer.INSTANCE, BuiltinSerializersKt.getNullable(StringSerializer.INSTANCE), BuiltinSerializersKt.getNullable(StringSerializer.INSTANCE), BuiltinSerializersKt.getNullable(LongSerializer.INSTANCE), BuiltinSerializersKt.getNullable(LongSerializer.INSTANCE), BuiltinSerializersKt.getNullable(LongSerializer.INSTANCE), BuiltinSerializersKt.getNullable(LongSerializer.INSTANCE), BuiltinSerializersKt.getNullable(StringSerializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public DeviceNode.VungleExt deserialize(Decoder decoder) {
        Object objDecodeNullableSerializableElement;
        Object objDecodeNullableSerializableElement2;
        int i;
        Object obj;
        Object objDecodeNullableSerializableElement3;
        Object objDecodeNullableSerializableElement4;
        Object objDecodeNullableSerializableElement5;
        Object obj2;
        Object objDecodeNullableSerializableElement6;
        Object objDecodeNullableSerializableElement7;
        Object objDecodeNullableSerializableElement8;
        Object obj3;
        Object objDecodeNullableSerializableElement9;
        boolean z;
        float f;
        int i2;
        boolean z2;
        int i3;
        float f2;
        int i4;
        Object obj4;
        Object objDecodeNullableSerializableElement10;
        Object objDecodeNullableSerializableElement11;
        boolean z3;
        int i5;
        int i6;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(descriptor2);
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            boolean zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(descriptor2, 0);
            objDecodeNullableSerializableElement3 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 1, StringSerializer.INSTANCE, null);
            objDecodeNullableSerializableElement11 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 2, IntSerializer.INSTANCE, null);
            float fDecodeFloatElement = compositeDecoderBeginStructure.decodeFloatElement(descriptor2, 3);
            objDecodeNullableSerializableElement4 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 4, StringSerializer.INSTANCE, null);
            int iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(descriptor2, 5);
            Object objDecodeNullableSerializableElement12 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 6, StringSerializer.INSTANCE, null);
            Object objDecodeNullableSerializableElement13 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 7, StringSerializer.INSTANCE, null);
            objDecodeNullableSerializableElement9 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 8, StringSerializer.INSTANCE, null);
            Object objDecodeNullableSerializableElement14 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 9, StringSerializer.INSTANCE, null);
            objDecodeNullableSerializableElement8 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 10, StringSerializer.INSTANCE, null);
            float fDecodeFloatElement2 = compositeDecoderBeginStructure.decodeFloatElement(descriptor2, 11);
            int iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(descriptor2, 12);
            boolean zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(descriptor2, 13);
            int iDecodeIntElement3 = compositeDecoderBeginStructure.decodeIntElement(descriptor2, 14);
            boolean zDecodeBooleanElement3 = compositeDecoderBeginStructure.decodeBooleanElement(descriptor2, 15);
            Object objDecodeNullableSerializableElement15 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 16, StringSerializer.INSTANCE, null);
            objDecodeNullableSerializableElement7 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 17, StringSerializer.INSTANCE, null);
            objDecodeNullableSerializableElement6 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 18, LongSerializer.INSTANCE, null);
            Object objDecodeNullableSerializableElement16 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 19, LongSerializer.INSTANCE, null);
            Object objDecodeNullableSerializableElement17 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 20, LongSerializer.INSTANCE, null);
            objDecodeNullableSerializableElement10 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 21, LongSerializer.INSTANCE, null);
            i = 8388607;
            obj = objDecodeNullableSerializableElement13;
            objDecodeNullableSerializableElement = objDecodeNullableSerializableElement17;
            objDecodeNullableSerializableElement5 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 22, StringSerializer.INSTANCE, null);
            obj3 = objDecodeNullableSerializableElement14;
            f = fDecodeFloatElement;
            z = zDecodeBooleanElement3;
            obj2 = objDecodeNullableSerializableElement15;
            z2 = zDecodeBooleanElement2;
            i3 = iDecodeIntElement3;
            z3 = zDecodeBooleanElement;
            f2 = fDecodeFloatElement2;
            i4 = iDecodeIntElement2;
            objDecodeNullableSerializableElement2 = objDecodeNullableSerializableElement16;
            obj4 = objDecodeNullableSerializableElement12;
            i2 = iDecodeIntElement;
        } else {
            int i7 = 0;
            objDecodeNullableSerializableElement = null;
            boolean zDecodeBooleanElement4 = false;
            int iDecodeIntElement4 = 0;
            boolean zDecodeBooleanElement5 = false;
            boolean zDecodeBooleanElement6 = false;
            int iDecodeIntElement5 = 0;
            int iDecodeIntElement6 = 0;
            boolean z4 = true;
            Object objDecodeNullableSerializableElement18 = null;
            Object objDecodeNullableSerializableElement19 = null;
            Object objDecodeNullableSerializableElement20 = null;
            Object objDecodeNullableSerializableElement21 = null;
            Object objDecodeNullableSerializableElement22 = null;
            objDecodeNullableSerializableElement2 = null;
            Object objDecodeNullableSerializableElement23 = null;
            Object objDecodeNullableSerializableElement24 = null;
            Object objDecodeNullableSerializableElement25 = null;
            Object objDecodeNullableSerializableElement26 = null;
            Object objDecodeNullableSerializableElement27 = null;
            Object objDecodeNullableSerializableElement28 = null;
            Object objDecodeNullableSerializableElement29 = null;
            float fDecodeFloatElement3 = 0.0f;
            float fDecodeFloatElement4 = 0.0f;
            Object objDecodeNullableSerializableElement30 = null;
            while (z4) {
                Object obj5 = objDecodeNullableSerializableElement21;
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(descriptor2);
                switch (iDecodeElementIndex) {
                    case -1:
                        z4 = false;
                        objDecodeNullableSerializableElement21 = obj5;
                        i7 = i7;
                        objDecodeNullableSerializableElement22 = objDecodeNullableSerializableElement22;
                        objDecodeNullableSerializableElement28 = objDecodeNullableSerializableElement28;
                        objDecodeNullableSerializableElement19 = objDecodeNullableSerializableElement19;
                        break;
                    case 0:
                        zDecodeBooleanElement6 = compositeDecoderBeginStructure.decodeBooleanElement(descriptor2, 0);
                        objDecodeNullableSerializableElement18 = objDecodeNullableSerializableElement18;
                        objDecodeNullableSerializableElement21 = obj5;
                        i7 |= 1;
                        objDecodeNullableSerializableElement22 = objDecodeNullableSerializableElement22;
                        objDecodeNullableSerializableElement28 = objDecodeNullableSerializableElement28;
                        objDecodeNullableSerializableElement19 = objDecodeNullableSerializableElement19;
                        break;
                    case 1:
                        objDecodeNullableSerializableElement19 = objDecodeNullableSerializableElement19;
                        objDecodeNullableSerializableElement18 = objDecodeNullableSerializableElement18;
                        objDecodeNullableSerializableElement21 = obj5;
                        objDecodeNullableSerializableElement29 = objDecodeNullableSerializableElement29;
                        objDecodeNullableSerializableElement22 = objDecodeNullableSerializableElement22;
                        objDecodeNullableSerializableElement28 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 1, StringSerializer.INSTANCE, objDecodeNullableSerializableElement28);
                        i7 |= 2;
                        objDecodeNullableSerializableElement19 = objDecodeNullableSerializableElement19;
                        break;
                    case 2:
                        objDecodeNullableSerializableElement29 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 2, IntSerializer.INSTANCE, objDecodeNullableSerializableElement29);
                        i7 |= 4;
                        objDecodeNullableSerializableElement18 = objDecodeNullableSerializableElement18;
                        objDecodeNullableSerializableElement21 = obj5;
                        objDecodeNullableSerializableElement19 = objDecodeNullableSerializableElement19;
                        objDecodeNullableSerializableElement22 = objDecodeNullableSerializableElement22;
                        break;
                    case 3:
                        fDecodeFloatElement3 = compositeDecoderBeginStructure.decodeFloatElement(descriptor2, 3);
                        objDecodeNullableSerializableElement18 = objDecodeNullableSerializableElement18;
                        objDecodeNullableSerializableElement21 = obj5;
                        i7 |= 8;
                        objDecodeNullableSerializableElement22 = objDecodeNullableSerializableElement22;
                        break;
                    case 4:
                        objDecodeNullableSerializableElement21 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 4, StringSerializer.INSTANCE, obj5);
                        objDecodeNullableSerializableElement18 = objDecodeNullableSerializableElement18;
                        i7 |= 16;
                        objDecodeNullableSerializableElement22 = objDecodeNullableSerializableElement22;
                        break;
                    case 5:
                        iDecodeIntElement4 = compositeDecoderBeginStructure.decodeIntElement(descriptor2, 5);
                        i7 |= 32;
                        objDecodeNullableSerializableElement22 = objDecodeNullableSerializableElement22;
                        objDecodeNullableSerializableElement18 = objDecodeNullableSerializableElement18;
                        objDecodeNullableSerializableElement21 = obj5;
                        break;
                    case 6:
                        objDecodeNullableSerializableElement18 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 6, StringSerializer.INSTANCE, objDecodeNullableSerializableElement18);
                        i7 |= 64;
                        objDecodeNullableSerializableElement22 = objDecodeNullableSerializableElement22;
                        objDecodeNullableSerializableElement21 = obj5;
                        break;
                    case 7:
                        objDecodeNullableSerializableElement18 = objDecodeNullableSerializableElement18;
                        objDecodeNullableSerializableElement22 = objDecodeNullableSerializableElement22;
                        objDecodeNullableSerializableElement19 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 7, StringSerializer.INSTANCE, objDecodeNullableSerializableElement19);
                        i7 |= 128;
                        objDecodeNullableSerializableElement22 = objDecodeNullableSerializableElement22;
                        objDecodeNullableSerializableElement21 = obj5;
                        objDecodeNullableSerializableElement18 = objDecodeNullableSerializableElement18;
                        break;
                    case 8:
                        objDecodeNullableSerializableElement18 = objDecodeNullableSerializableElement18;
                        objDecodeNullableSerializableElement22 = objDecodeNullableSerializableElement22;
                        objDecodeNullableSerializableElement27 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 8, StringSerializer.INSTANCE, objDecodeNullableSerializableElement27);
                        i7 |= 256;
                        objDecodeNullableSerializableElement22 = objDecodeNullableSerializableElement22;
                        objDecodeNullableSerializableElement21 = obj5;
                        objDecodeNullableSerializableElement18 = objDecodeNullableSerializableElement18;
                        break;
                    case 9:
                        objDecodeNullableSerializableElement18 = objDecodeNullableSerializableElement18;
                        objDecodeNullableSerializableElement22 = objDecodeNullableSerializableElement22;
                        objDecodeNullableSerializableElement26 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 9, StringSerializer.INSTANCE, objDecodeNullableSerializableElement26);
                        i7 |= 512;
                        objDecodeNullableSerializableElement22 = objDecodeNullableSerializableElement22;
                        objDecodeNullableSerializableElement21 = obj5;
                        objDecodeNullableSerializableElement18 = objDecodeNullableSerializableElement18;
                        break;
                    case 10:
                        objDecodeNullableSerializableElement18 = objDecodeNullableSerializableElement18;
                        objDecodeNullableSerializableElement22 = objDecodeNullableSerializableElement22;
                        objDecodeNullableSerializableElement25 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 10, StringSerializer.INSTANCE, objDecodeNullableSerializableElement25);
                        i7 |= 1024;
                        objDecodeNullableSerializableElement22 = objDecodeNullableSerializableElement22;
                        objDecodeNullableSerializableElement21 = obj5;
                        objDecodeNullableSerializableElement18 = objDecodeNullableSerializableElement18;
                        break;
                    case 11:
                        objDecodeNullableSerializableElement18 = objDecodeNullableSerializableElement18;
                        objDecodeNullableSerializableElement22 = objDecodeNullableSerializableElement22;
                        fDecodeFloatElement4 = compositeDecoderBeginStructure.decodeFloatElement(descriptor2, 11);
                        i7 |= 2048;
                        objDecodeNullableSerializableElement22 = objDecodeNullableSerializableElement22;
                        objDecodeNullableSerializableElement21 = obj5;
                        objDecodeNullableSerializableElement18 = objDecodeNullableSerializableElement18;
                        break;
                    case 12:
                        objDecodeNullableSerializableElement18 = objDecodeNullableSerializableElement18;
                        objDecodeNullableSerializableElement22 = objDecodeNullableSerializableElement22;
                        iDecodeIntElement6 = compositeDecoderBeginStructure.decodeIntElement(descriptor2, 12);
                        i7 |= 4096;
                        objDecodeNullableSerializableElement22 = objDecodeNullableSerializableElement22;
                        objDecodeNullableSerializableElement21 = obj5;
                        objDecodeNullableSerializableElement18 = objDecodeNullableSerializableElement18;
                        break;
                    case 13:
                        objDecodeNullableSerializableElement18 = objDecodeNullableSerializableElement18;
                        objDecodeNullableSerializableElement22 = objDecodeNullableSerializableElement22;
                        zDecodeBooleanElement5 = compositeDecoderBeginStructure.decodeBooleanElement(descriptor2, 13);
                        i7 |= 8192;
                        objDecodeNullableSerializableElement22 = objDecodeNullableSerializableElement22;
                        objDecodeNullableSerializableElement21 = obj5;
                        objDecodeNullableSerializableElement18 = objDecodeNullableSerializableElement18;
                        break;
                    case 14:
                        objDecodeNullableSerializableElement18 = objDecodeNullableSerializableElement18;
                        objDecodeNullableSerializableElement22 = objDecodeNullableSerializableElement22;
                        iDecodeIntElement5 = compositeDecoderBeginStructure.decodeIntElement(descriptor2, 14);
                        i7 |= 16384;
                        objDecodeNullableSerializableElement22 = objDecodeNullableSerializableElement22;
                        objDecodeNullableSerializableElement21 = obj5;
                        objDecodeNullableSerializableElement18 = objDecodeNullableSerializableElement18;
                        break;
                    case 15:
                        objDecodeNullableSerializableElement18 = objDecodeNullableSerializableElement18;
                        objDecodeNullableSerializableElement22 = objDecodeNullableSerializableElement22;
                        zDecodeBooleanElement4 = compositeDecoderBeginStructure.decodeBooleanElement(descriptor2, 15);
                        i7 |= 32768;
                        objDecodeNullableSerializableElement22 = objDecodeNullableSerializableElement22;
                        objDecodeNullableSerializableElement21 = obj5;
                        objDecodeNullableSerializableElement18 = objDecodeNullableSerializableElement18;
                        break;
                    case 16:
                        objDecodeNullableSerializableElement20 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 16, StringSerializer.INSTANCE, objDecodeNullableSerializableElement20);
                        i5 = 65536;
                        i7 |= i5;
                        objDecodeNullableSerializableElement22 = objDecodeNullableSerializableElement22;
                        objDecodeNullableSerializableElement21 = obj5;
                        objDecodeNullableSerializableElement18 = objDecodeNullableSerializableElement18;
                        break;
                    case 17:
                        objDecodeNullableSerializableElement24 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 17, StringSerializer.INSTANCE, objDecodeNullableSerializableElement24);
                        i5 = 131072;
                        i7 |= i5;
                        objDecodeNullableSerializableElement22 = objDecodeNullableSerializableElement22;
                        objDecodeNullableSerializableElement21 = obj5;
                        objDecodeNullableSerializableElement18 = objDecodeNullableSerializableElement18;
                        break;
                    case 18:
                        objDecodeNullableSerializableElement23 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 18, LongSerializer.INSTANCE, objDecodeNullableSerializableElement23);
                        i5 = 262144;
                        i7 |= i5;
                        objDecodeNullableSerializableElement22 = objDecodeNullableSerializableElement22;
                        objDecodeNullableSerializableElement21 = obj5;
                        objDecodeNullableSerializableElement18 = objDecodeNullableSerializableElement18;
                        break;
                    case 19:
                        objDecodeNullableSerializableElement2 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 19, LongSerializer.INSTANCE, objDecodeNullableSerializableElement2);
                        i6 = 524288;
                        i7 |= i6;
                        objDecodeNullableSerializableElement21 = obj5;
                        objDecodeNullableSerializableElement18 = objDecodeNullableSerializableElement18;
                        break;
                    case 20:
                        objDecodeNullableSerializableElement = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 20, LongSerializer.INSTANCE, objDecodeNullableSerializableElement);
                        i6 = 1048576;
                        i7 |= i6;
                        objDecodeNullableSerializableElement21 = obj5;
                        objDecodeNullableSerializableElement18 = objDecodeNullableSerializableElement18;
                        break;
                    case 21:
                        objDecodeNullableSerializableElement30 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 21, LongSerializer.INSTANCE, objDecodeNullableSerializableElement30);
                        i6 = 2097152;
                        i7 |= i6;
                        objDecodeNullableSerializableElement21 = obj5;
                        objDecodeNullableSerializableElement18 = objDecodeNullableSerializableElement18;
                        break;
                    case 22:
                        objDecodeNullableSerializableElement22 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 22, StringSerializer.INSTANCE, objDecodeNullableSerializableElement22);
                        i6 = 4194304;
                        i7 |= i6;
                        objDecodeNullableSerializableElement21 = obj5;
                        objDecodeNullableSerializableElement18 = objDecodeNullableSerializableElement18;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i = i7;
            obj = objDecodeNullableSerializableElement19;
            Object obj6 = objDecodeNullableSerializableElement22;
            Object obj7 = objDecodeNullableSerializableElement21;
            Object obj8 = objDecodeNullableSerializableElement18;
            objDecodeNullableSerializableElement3 = objDecodeNullableSerializableElement28;
            objDecodeNullableSerializableElement4 = obj7;
            objDecodeNullableSerializableElement5 = obj6;
            obj2 = objDecodeNullableSerializableElement20;
            objDecodeNullableSerializableElement6 = objDecodeNullableSerializableElement23;
            objDecodeNullableSerializableElement7 = objDecodeNullableSerializableElement24;
            objDecodeNullableSerializableElement8 = objDecodeNullableSerializableElement25;
            obj3 = objDecodeNullableSerializableElement26;
            objDecodeNullableSerializableElement9 = objDecodeNullableSerializableElement27;
            z = zDecodeBooleanElement4;
            f = fDecodeFloatElement3;
            i2 = iDecodeIntElement4;
            z2 = zDecodeBooleanElement5;
            i3 = iDecodeIntElement5;
            f2 = fDecodeFloatElement4;
            i4 = iDecodeIntElement6;
            obj4 = obj8;
            objDecodeNullableSerializableElement10 = objDecodeNullableSerializableElement30;
            objDecodeNullableSerializableElement11 = objDecodeNullableSerializableElement29;
            z3 = zDecodeBooleanElement6;
        }
        compositeDecoderBeginStructure.endStructure(descriptor2);
        return new DeviceNode.VungleExt(i, z3, (String) objDecodeNullableSerializableElement3, (Integer) objDecodeNullableSerializableElement11, f, (String) objDecodeNullableSerializableElement4, i2, (String) obj4, (String) obj, (String) objDecodeNullableSerializableElement9, (String) obj3, (String) objDecodeNullableSerializableElement8, f2, i4, z2, i3, z, (String) obj2, (String) objDecodeNullableSerializableElement7, (Long) objDecodeNullableSerializableElement6, (Long) objDecodeNullableSerializableElement2, (Long) objDecodeNullableSerializableElement, (Long) objDecodeNullableSerializableElement10, (String) objDecodeNullableSerializableElement5, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(Encoder encoder, DeviceNode.VungleExt value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(descriptor2);
        DeviceNode.VungleExt.write$Self(value, compositeEncoderBeginStructure, descriptor2);
        compositeEncoderBeginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
