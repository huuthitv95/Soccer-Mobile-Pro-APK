package com.mbridge.msdk.playercommon.exoplayer2.metadata.id3;

import android.util.Log;
import com.google.android.exoplayer2.C9415C;
import com.mbridge.msdk.playercommon.exoplayer2.metadata.Metadata;
import com.mbridge.msdk.playercommon.exoplayer2.metadata.MetadataDecoder;
import com.mbridge.msdk.playercommon.exoplayer2.metadata.MetadataInputBuffer;
import com.mbridge.msdk.playercommon.exoplayer2.util.ParsableByteArray;
import com.mbridge.msdk.playercommon.exoplayer2.util.Util;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: loaded from: classes7.dex */
public final class Id3Decoder implements MetadataDecoder {
    private static final int FRAME_FLAG_V3_HAS_GROUP_IDENTIFIER = 32;
    private static final int FRAME_FLAG_V3_IS_COMPRESSED = 128;
    private static final int FRAME_FLAG_V3_IS_ENCRYPTED = 64;
    private static final int FRAME_FLAG_V4_HAS_DATA_LENGTH = 1;
    private static final int FRAME_FLAG_V4_HAS_GROUP_IDENTIFIER = 64;
    private static final int FRAME_FLAG_V4_IS_COMPRESSED = 8;
    private static final int FRAME_FLAG_V4_IS_ENCRYPTED = 4;
    private static final int FRAME_FLAG_V4_IS_UNSYNCHRONIZED = 2;
    public static final int ID3_HEADER_LENGTH = 10;
    private static final int ID3_TEXT_ENCODING_ISO_8859_1 = 0;
    private static final int ID3_TEXT_ENCODING_UTF_16 = 1;
    private static final int ID3_TEXT_ENCODING_UTF_16BE = 2;
    private static final int ID3_TEXT_ENCODING_UTF_8 = 3;
    private static final String TAG = "Id3Decoder";
    private final FramePredicate framePredicate;
    public static final FramePredicate NO_FRAMES_PREDICATE = new FramePredicate() { // from class: com.mbridge.msdk.playercommon.exoplayer2.metadata.id3.Id3Decoder.1
        @Override // com.mbridge.msdk.playercommon.exoplayer2.metadata.id3.Id3Decoder.FramePredicate
        public boolean evaluate(int i, int i2, int i3, int i4, int i5) {
            return false;
        }
    };
    public static final int ID3_TAG = Util.getIntegerCodeForString("ID3");

    public interface FramePredicate {
        boolean evaluate(int i, int i2, int i3, int i4, int i5);
    }

    private static final class Id3Header {
        private final int framesSize;
        private final boolean isUnsynchronized;
        private final int majorVersion;

        public Id3Header(int i, boolean z, int i2) {
            this.majorVersion = i;
            this.isUnsynchronized = z;
            this.framesSize = i2;
        }
    }

    public Id3Decoder() {
        this(null);
    }

    public Id3Decoder(FramePredicate framePredicate) {
        this.framePredicate = framePredicate;
    }

    private static byte[] copyOfRangeIfValid(byte[] bArr, int i, int i2) {
        return i2 <= i ? new byte[0] : Arrays.copyOfRange(bArr, i, i2);
    }

    private static ApicFrame decodeApicFrame(ParsableByteArray parsableByteArray, int i, int i2) throws UnsupportedEncodingException {
        int iIndexOfZeroByte;
        String str;
        int unsignedByte = parsableByteArray.readUnsignedByte();
        String charsetName = getCharsetName(unsignedByte);
        int i3 = i - 1;
        byte[] bArr = new byte[i3];
        parsableByteArray.readBytes(bArr, 0, i3);
        if (i2 == 2) {
            str = "image/" + Util.toLowerInvariant(new String(bArr, 0, 3, C9415C.ISO88591_NAME));
            if ("image/jpg".equals(str)) {
                str = "image/jpeg";
            }
            iIndexOfZeroByte = 2;
        } else {
            iIndexOfZeroByte = indexOfZeroByte(bArr, 0);
            String lowerInvariant = Util.toLowerInvariant(new String(bArr, 0, iIndexOfZeroByte, C9415C.ISO88591_NAME));
            if (lowerInvariant.indexOf(47) == -1) {
                str = "image/" + lowerInvariant;
            } else {
                str = lowerInvariant;
            }
        }
        int i4 = bArr[iIndexOfZeroByte + 1] & 255;
        int i5 = iIndexOfZeroByte + 2;
        int iIndexOfEos = indexOfEos(bArr, i5, unsignedByte);
        return new ApicFrame(str, new String(bArr, i5, iIndexOfEos - i5, charsetName), i4, copyOfRangeIfValid(bArr, iIndexOfEos + delimiterLength(unsignedByte), i3));
    }

    private static BinaryFrame decodeBinaryFrame(ParsableByteArray parsableByteArray, int i, String str) {
        byte[] bArr = new byte[i];
        parsableByteArray.readBytes(bArr, 0, i);
        return new BinaryFrame(str, bArr);
    }

    private static ChapterFrame decodeChapterFrame(ParsableByteArray parsableByteArray, int i, int i2, boolean z, int i3, FramePredicate framePredicate) throws Throwable {
        int position = parsableByteArray.getPosition();
        int iIndexOfZeroByte = indexOfZeroByte(parsableByteArray.data, position);
        String str = new String(parsableByteArray.data, position, iIndexOfZeroByte - position, C9415C.ISO88591_NAME);
        parsableByteArray.setPosition(iIndexOfZeroByte + 1);
        int i4 = parsableByteArray.readInt();
        int i5 = parsableByteArray.readInt();
        long unsignedInt = parsableByteArray.readUnsignedInt();
        if (unsignedInt == 4294967295L) {
            unsignedInt = -1;
        }
        long unsignedInt2 = parsableByteArray.readUnsignedInt();
        long j = unsignedInt2 == 4294967295L ? -1L : unsignedInt2;
        ArrayList arrayList = new ArrayList();
        int i6 = position + i;
        while (parsableByteArray.getPosition() < i6) {
            Id3Frame id3FrameDecodeFrame = decodeFrame(i2, parsableByteArray, z, i3, framePredicate);
            if (id3FrameDecodeFrame != null) {
                arrayList.add(id3FrameDecodeFrame);
            }
        }
        Id3Frame[] id3FrameArr = new Id3Frame[arrayList.size()];
        arrayList.toArray(id3FrameArr);
        return new ChapterFrame(str, i4, i5, unsignedInt, j, id3FrameArr);
    }

    private static ChapterTocFrame decodeChapterTOCFrame(ParsableByteArray parsableByteArray, int i, int i2, boolean z, int i3, FramePredicate framePredicate) throws Throwable {
        int position = parsableByteArray.getPosition();
        int iIndexOfZeroByte = indexOfZeroByte(parsableByteArray.data, position);
        String str = new String(parsableByteArray.data, position, iIndexOfZeroByte - position, C9415C.ISO88591_NAME);
        parsableByteArray.setPosition(iIndexOfZeroByte + 1);
        int unsignedByte = parsableByteArray.readUnsignedByte();
        boolean z2 = (unsignedByte & 2) != 0;
        boolean z3 = (unsignedByte & 1) != 0;
        int unsignedByte2 = parsableByteArray.readUnsignedByte();
        String[] strArr = new String[unsignedByte2];
        for (int i4 = 0; i4 < unsignedByte2; i4++) {
            int position2 = parsableByteArray.getPosition();
            int iIndexOfZeroByte2 = indexOfZeroByte(parsableByteArray.data, position2);
            strArr[i4] = new String(parsableByteArray.data, position2, iIndexOfZeroByte2 - position2, C9415C.ISO88591_NAME);
            parsableByteArray.setPosition(iIndexOfZeroByte2 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i5 = position + i;
        while (parsableByteArray.getPosition() < i5) {
            Id3Frame id3FrameDecodeFrame = decodeFrame(i2, parsableByteArray, z, i3, framePredicate);
            if (id3FrameDecodeFrame != null) {
                arrayList.add(id3FrameDecodeFrame);
            }
        }
        Id3Frame[] id3FrameArr = new Id3Frame[arrayList.size()];
        arrayList.toArray(id3FrameArr);
        return new ChapterTocFrame(str, z2, z3, strArr, id3FrameArr);
    }

    private static CommentFrame decodeCommentFrame(ParsableByteArray parsableByteArray, int i) throws UnsupportedEncodingException {
        if (i < 4) {
            return null;
        }
        int unsignedByte = parsableByteArray.readUnsignedByte();
        String charsetName = getCharsetName(unsignedByte);
        byte[] bArr = new byte[3];
        parsableByteArray.readBytes(bArr, 0, 3);
        String str = new String(bArr, 0, 3);
        int i2 = i - 4;
        byte[] bArr2 = new byte[i2];
        parsableByteArray.readBytes(bArr2, 0, i2);
        int iIndexOfEos = indexOfEos(bArr2, 0, unsignedByte);
        String str2 = new String(bArr2, 0, iIndexOfEos, charsetName);
        int iDelimiterLength = iIndexOfEos + delimiterLength(unsignedByte);
        return new CommentFrame(str, str2, decodeStringIfValid(bArr2, iDelimiterLength, indexOfEos(bArr2, iDelimiterLength, unsignedByte), charsetName));
    }

    /* JADX WARN: Code duplicated, block: B:138:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:157:0x01de  */
    /* JADX WARN: Code duplicated, block: B:159:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:165:0x01fb A[Catch: UnsupportedEncodingException -> 0x0228, all -> 0x0231, TryCatch #0 {all -> 0x0231, blocks: (B:167:0x0209, B:170:0x0228, B:164:0x01f6, B:165:0x01fb), top: B:179:0x0112 }] */
    /* JADX WARN: Code duplicated, block: B:167:0x0209 A[Catch: UnsupportedEncodingException -> 0x0228, all -> 0x0231, TRY_LEAVE, TryCatch #0 {all -> 0x0231, blocks: (B:167:0x0209, B:170:0x0228, B:164:0x01f6, B:165:0x01fb), top: B:179:0x0112 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:167:0x0209, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v10 */
    /* JADX WARN: Type inference failed for: r16v11 */
    /* JADX WARN: Type inference failed for: r16v12 */
    /* JADX WARN: Type inference failed for: r16v13 */
    /* JADX WARN: Type inference failed for: r16v21 */
    /* JADX WARN: Type inference failed for: r16v22 */
    /* JADX WARN: Type inference failed for: r16v23 */
    /* JADX WARN: Type inference failed for: r16v24 */
    /* JADX WARN: Type inference failed for: r16v25 */
    /* JADX WARN: Type inference failed for: r16v26 */
    /* JADX WARN: Type inference failed for: r16v27 */
    /* JADX WARN: Type inference failed for: r16v28 */
    /* JADX WARN: Type inference failed for: r16v5 */
    /* JADX WARN: Type inference failed for: r16v7 */
    /* JADX WARN: Type inference failed for: r16v8 */
    /* JADX WARN: Type inference failed for: r16v9, types: [com.mbridge.msdk.playercommon.exoplayer2.metadata.id3.Id3Frame] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11, types: [com.mbridge.msdk.playercommon.exoplayer2.util.ParsableByteArray] */
    /* JADX WARN: Type inference failed for: r1v12, types: [com.mbridge.msdk.playercommon.exoplayer2.util.ParsableByteArray] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v22, types: [com.mbridge.msdk.playercommon.exoplayer2.util.ParsableByteArray] */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v34 */
    /* JADX WARN: Type inference failed for: r1v35 */
    /* JADX WARN: Type inference failed for: r1v36 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6, types: [int] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v13, types: [int] */
    /* JADX WARN: Type inference failed for: r9v22 */
    /* JADX WARN: Type inference failed for: r9v23 */
    /* JADX WARN: Type inference failed for: r9v9, types: [int] */
    private static Id3Frame decodeFrame(int i, ParsableByteArray parsableByteArray, boolean z, int i2, FramePredicate framePredicate) throws Throwable {
        int unsignedIntToInt;
        ?? r1;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        ?? r16;
        ?? r9;
        int i3;
        Id3Frame id3FrameDecodeBinaryFrame;
        ?? r10;
        ?? r17;
        boolean zEvaluate;
        int i4 = i;
        ParsableByteArray parsableByteArray2 = parsableByteArray;
        int unsignedByte = parsableByteArray2.readUnsignedByte();
        int unsignedByte2 = parsableByteArray2.readUnsignedByte();
        int unsignedByte3 = parsableByteArray2.readUnsignedByte();
        boolean z6 = false;
        int unsignedByte4 = i4 >= 3 ? parsableByteArray2.readUnsignedByte() : 0;
        if (i4 == 4) {
            unsignedIntToInt = parsableByteArray2.readUnsignedIntToInt();
            if (!z) {
                unsignedIntToInt = (((unsignedIntToInt >> 24) & 255) << 21) | (unsignedIntToInt & 255) | (((unsignedIntToInt >> 8) & 255) << 7) | (((unsignedIntToInt >> 16) & 255) << 14);
            }
        } else {
            unsignedIntToInt = i4 == 3 ? parsableByteArray2.readUnsignedIntToInt() : parsableByteArray2.readUnsignedInt24();
        }
        int iRemoveUnsynchronization = unsignedIntToInt;
        int unsignedShort = i4 >= 3 ? parsableByteArray2.readUnsignedShort() : 0;
        if (unsignedByte == 0 && unsignedByte2 == 0 && unsignedByte3 == 0 && unsignedByte4 == 0 && iRemoveUnsynchronization == 0 && unsignedShort == 0) {
            parsableByteArray2.setPosition(parsableByteArray2.limit());
            return null;
        }
        int position = parsableByteArray2.getPosition() + iRemoveUnsynchronization;
        if (position > parsableByteArray2.limit()) {
            Log.w(TAG, "Frame size exceeds remaining tag data");
            parsableByteArray2.setPosition(parsableByteArray2.limit());
            return null;
        }
        if (framePredicate != null) {
            zEvaluate = framePredicate.evaluate(i4, unsignedByte, unsignedByte2, unsignedByte3, unsignedByte4);
            r1 = unsignedByte2;
            if (!zEvaluate) {
                i4 = i4;
                parsableByteArray2.setPosition(position);
                return null;
            }
        } else {
            r1 = unsignedByte2;
        }
        i4 = i4;
        if (i4 == 3) {
            boolean z7 = (unsignedShort & 128) != 0;
            boolean z8 = (unsignedShort & 64) != 0;
            boolean z9 = (unsignedShort & 32) != 0;
            z5 = false;
            boolean z10 = z7;
            z4 = z8 ? 1 : 0;
            z2 = z9;
            z3 = z10 ? 1 : 0;
            z6 = z10;
            r16 = z8;
        } else if (i4 == 4) {
            boolean z11 = (unsignedShort & 64) != 0;
            boolean z12 = (unsignedShort & 8) != 0;
            boolean z13 = (unsignedShort & 4) != 0;
            boolean z14 = (unsignedShort & 2) != 0;
            boolean z15 = (unsignedShort & 1) != 0;
            z6 = z12 ? 1 : 0;
            z2 = z11;
            z3 = z15;
            r16 = z12;
            z4 = z13;
            z5 = z14;
        } else {
            z2 = false;
            z3 = false;
            z4 = false;
            z5 = false;
        }
        if (z6 || z4) {
            r16 = zEvaluate;
            Log.w(TAG, "Skipping unsupported compressed or encrypted frame");
            parsableByteArray2.setPosition(position);
            return null;
        }
        if (z2) {
            iRemoveUnsynchronization--;
            parsableByteArray2.skipBytes(1);
        }
        if (z3) {
            iRemoveUnsynchronization -= 4;
            parsableByteArray2.skipBytes(4);
        }
        if (z5) {
            iRemoveUnsynchronization = removeUnsynchronization(parsableByteArray2, iRemoveUnsynchronization);
        }
        try {
            try {
                try {
                    try {
                        if (unsignedByte == 84 && r1 == 88 && unsignedByte3 == 88 && (i4 == 2 || unsignedByte4 == 88)) {
                            id3FrameDecodeBinaryFrame = decodeTxxxFrame(parsableByteArray2, iRemoveUnsynchronization);
                        } else if (unsignedByte == 84) {
                            id3FrameDecodeBinaryFrame = decodeTextInformationFrame(parsableByteArray2, iRemoveUnsynchronization, getFrameId(i4, unsignedByte, r1, unsignedByte3, unsignedByte4));
                        } else if (unsignedByte == 87 && r1 == 88 && unsignedByte3 == 88 && (i4 == 2 || unsignedByte4 == 88)) {
                            id3FrameDecodeBinaryFrame = decodeWxxxFrame(parsableByteArray2, iRemoveUnsynchronization);
                        } else {
                            if (unsignedByte != 87) {
                                if (unsignedByte == 80 && r1 == 82 && unsignedByte3 == 73 && unsignedByte4 == 86) {
                                    id3FrameDecodeBinaryFrame = decodePrivFrame(parsableByteArray2, iRemoveUnsynchronization);
                                } else {
                                    r16 = 0;
                                    try {
                                        if (unsignedByte == 71 && r1 == 69 && unsignedByte3 == 79 && (unsignedByte4 == 66 || i4 == 2)) {
                                            id3FrameDecodeBinaryFrame = decodeGeobFrame(parsableByteArray2, iRemoveUnsynchronization);
                                        } else {
                                            if (i4 == 2) {
                                                if (unsignedByte == 80 && r1 == 73 && unsignedByte3 == 67) {
                                                    id3FrameDecodeBinaryFrame = decodeApicFrame(parsableByteArray2, iRemoveUnsynchronization, i4);
                                                } else if (unsignedByte != 67 && r1 == 79 && unsignedByte3 == 77 && (unsignedByte4 == 77 || i4 == 2)) {
                                                    id3FrameDecodeBinaryFrame = decodeCommentFrame(parsableByteArray2, iRemoveUnsynchronization);
                                                } else if (unsignedByte != 67 && r1 == 72 && unsignedByte3 == 65 && unsignedByte4 == 80) {
                                                    r10 = r1;
                                                    unsignedByte3 = unsignedByte3;
                                                    iRemoveUnsynchronization = iRemoveUnsynchronization;
                                                    i3 = unsignedByte4;
                                                    try {
                                                        id3FrameDecodeBinaryFrame = decodeChapterFrame(parsableByteArray2, iRemoveUnsynchronization, i4, z, i2, framePredicate);
                                                        i4 = i;
                                                        r1 = parsableByteArray;
                                                        r16 = r16;
                                                    } catch (UnsupportedEncodingException unused) {
                                                        r1 = parsableByteArray;
                                                        Log.w(TAG, "Unsupported character encoding");
                                                        r1.setPosition(position);
                                                        return r16;
                                                    } catch (Throwable th) {
                                                        th = th;
                                                        r1 = parsableByteArray;
                                                        r1.setPosition(position);
                                                        throw th;
                                                    }
                                                } else {
                                                    r9 = r1;
                                                    unsignedByte3 = unsignedByte3;
                                                    iRemoveUnsynchronization = iRemoveUnsynchronization;
                                                    i3 = unsignedByte4;
                                                    if (unsignedByte != 67 && r9 == 84 && unsignedByte3 == 79 && i3 == 67) {
                                                        i4 = i;
                                                        ParsableByteArray parsableByteArray3 = parsableByteArray;
                                                        id3FrameDecodeBinaryFrame = decodeChapterTOCFrame(parsableByteArray3, iRemoveUnsynchronization, i4, z, i2, framePredicate);
                                                        r1 = parsableByteArray3;
                                                        r10 = r9;
                                                        r16 = r16;
                                                    } else {
                                                        i4 = i;
                                                        ParsableByteArray parsableByteArray4 = parsableByteArray;
                                                        id3FrameDecodeBinaryFrame = decodeBinaryFrame(parsableByteArray4, iRemoveUnsynchronization, getFrameId(i4, unsignedByte, r9, unsignedByte3, i3));
                                                        r1 = parsableByteArray4;
                                                        r10 = r9;
                                                        r16 = r16;
                                                    }
                                                }
                                            } else if (unsignedByte == 65 && r1 == 80 && unsignedByte3 == 73 && unsignedByte4 == 67) {
                                                id3FrameDecodeBinaryFrame = decodeApicFrame(parsableByteArray2, iRemoveUnsynchronization, i4);
                                            } else {
                                                if (unsignedByte != 67) {
                                                }
                                                if (unsignedByte != 67) {
                                                    r9 = r1;
                                                    unsignedByte3 = unsignedByte3;
                                                    iRemoveUnsynchronization = iRemoveUnsynchronization;
                                                    i3 = unsignedByte4;
                                                    if (unsignedByte != 67) {
                                                        i4 = i;
                                                        ParsableByteArray parsableByteArray5 = parsableByteArray;
                                                        id3FrameDecodeBinaryFrame = decodeBinaryFrame(parsableByteArray5, iRemoveUnsynchronization, getFrameId(i4, unsignedByte, r9, unsignedByte3, i3));
                                                        r1 = parsableByteArray5;
                                                        r10 = r9;
                                                        r16 = r16;
                                                    } else {
                                                        i4 = i;
                                                        ParsableByteArray parsableByteArray6 = parsableByteArray;
                                                        id3FrameDecodeBinaryFrame = decodeBinaryFrame(parsableByteArray6, iRemoveUnsynchronization, getFrameId(i4, unsignedByte, r9, unsignedByte3, i3));
                                                        r1 = parsableByteArray6;
                                                        r10 = r9;
                                                        r16 = r16;
                                                    }
                                                } else {
                                                    r9 = r1;
                                                    unsignedByte3 = unsignedByte3;
                                                    iRemoveUnsynchronization = iRemoveUnsynchronization;
                                                    i3 = unsignedByte4;
                                                    if (unsignedByte != 67) {
                                                        i4 = i;
                                                        ParsableByteArray parsableByteArray7 = parsableByteArray;
                                                        id3FrameDecodeBinaryFrame = decodeBinaryFrame(parsableByteArray7, iRemoveUnsynchronization, getFrameId(i4, unsignedByte, r9, unsignedByte3, i3));
                                                        r1 = parsableByteArray7;
                                                        r10 = r9;
                                                        r16 = r16;
                                                    } else {
                                                        i4 = i;
                                                        ParsableByteArray parsableByteArray8 = parsableByteArray;
                                                        id3FrameDecodeBinaryFrame = decodeBinaryFrame(parsableByteArray8, iRemoveUnsynchronization, getFrameId(i4, unsignedByte, r9, unsignedByte3, i3));
                                                        r1 = parsableByteArray8;
                                                        r10 = r9;
                                                        r16 = r16;
                                                    }
                                                }
                                            }
                                            i3 = unsignedByte4;
                                            r1 = parsableByteArray2;
                                            r10 = r1;
                                            r16 = r17;
                                        }
                                        r17 = r16;
                                        i3 = unsignedByte4;
                                        r1 = parsableByteArray2;
                                        r10 = r1;
                                        r16 = r17;
                                    } catch (UnsupportedEncodingException unused2) {
                                        r1 = parsableByteArray2;
                                    }
                                }
                                if (id3FrameDecodeBinaryFrame == null) {
                                    Log.w(TAG, "Failed to decode frame: id=" + getFrameId(i4, unsignedByte, r10, unsignedByte3, i3) + ", frameSize=" + iRemoveUnsynchronization);
                                }
                                r1.setPosition(position);
                                return id3FrameDecodeBinaryFrame;
                            }
                            id3FrameDecodeBinaryFrame = decodeUrlLinkFrame(parsableByteArray2, iRemoveUnsynchronization, getFrameId(i4, unsignedByte, r1, unsignedByte3, unsignedByte4));
                        }
                        r17 = 0;
                        i3 = unsignedByte4;
                        r1 = parsableByteArray2;
                        r10 = r1;
                        r16 = r17;
                        if (id3FrameDecodeBinaryFrame == null) {
                            Log.w(TAG, "Failed to decode frame: id=" + getFrameId(i4, unsignedByte, r10, unsignedByte3, i3) + ", frameSize=" + iRemoveUnsynchronization);
                        }
                        r1.setPosition(position);
                        return id3FrameDecodeBinaryFrame;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (UnsupportedEncodingException unused3) {
                }
            } catch (UnsupportedEncodingException unused4) {
                r1 = parsableByteArray2;
                r16 = 0;
            }
        } catch (Throwable th3) {
            th = th3;
            r1 = parsableByteArray2;
        }
    }

    private static GeobFrame decodeGeobFrame(ParsableByteArray parsableByteArray, int i) throws UnsupportedEncodingException {
        int unsignedByte = parsableByteArray.readUnsignedByte();
        String charsetName = getCharsetName(unsignedByte);
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        parsableByteArray.readBytes(bArr, 0, i2);
        int iIndexOfZeroByte = indexOfZeroByte(bArr, 0);
        String str = new String(bArr, 0, iIndexOfZeroByte, C9415C.ISO88591_NAME);
        int i3 = iIndexOfZeroByte + 1;
        int iIndexOfEos = indexOfEos(bArr, i3, unsignedByte);
        String strDecodeStringIfValid = decodeStringIfValid(bArr, i3, iIndexOfEos, charsetName);
        int iDelimiterLength = iIndexOfEos + delimiterLength(unsignedByte);
        int iIndexOfEos2 = indexOfEos(bArr, iDelimiterLength, unsignedByte);
        return new GeobFrame(str, strDecodeStringIfValid, decodeStringIfValid(bArr, iDelimiterLength, iIndexOfEos2, charsetName), copyOfRangeIfValid(bArr, iIndexOfEos2 + delimiterLength(unsignedByte), i2));
    }

    private static Id3Header decodeHeader(ParsableByteArray parsableByteArray) {
        if (parsableByteArray.bytesLeft() < 10) {
            Log.w(TAG, "Data too short to be an ID3 tag");
            return null;
        }
        int unsignedInt24 = parsableByteArray.readUnsignedInt24();
        if (unsignedInt24 != ID3_TAG) {
            Log.w(TAG, "Unexpected first three bytes of ID3 tag header: " + unsignedInt24);
            return null;
        }
        int unsignedByte = parsableByteArray.readUnsignedByte();
        parsableByteArray.skipBytes(1);
        int unsignedByte2 = parsableByteArray.readUnsignedByte();
        int synchSafeInt = parsableByteArray.readSynchSafeInt();
        if (unsignedByte == 2) {
            if ((unsignedByte2 & 64) != 0) {
                Log.w(TAG, "Skipped ID3 tag with majorVersion=2 and undefined compression scheme");
                return null;
            }
        } else if (unsignedByte == 3) {
            if ((unsignedByte2 & 64) != 0) {
                int i = parsableByteArray.readInt();
                parsableByteArray.skipBytes(i);
                synchSafeInt -= i + 4;
            }
        } else {
            if (unsignedByte != 4) {
                Log.w(TAG, "Skipped ID3 tag with unsupported majorVersion=" + unsignedByte);
                return null;
            }
            if ((unsignedByte2 & 64) != 0) {
                int synchSafeInt2 = parsableByteArray.readSynchSafeInt();
                parsableByteArray.skipBytes(synchSafeInt2 - 4);
                synchSafeInt -= synchSafeInt2;
            }
            if ((unsignedByte2 & 16) != 0) {
                synchSafeInt -= 10;
            }
        }
        return new Id3Header(unsignedByte, unsignedByte < 4 && (unsignedByte2 & 128) != 0, synchSafeInt);
    }

    private static PrivFrame decodePrivFrame(ParsableByteArray parsableByteArray, int i) throws UnsupportedEncodingException {
        byte[] bArr = new byte[i];
        parsableByteArray.readBytes(bArr, 0, i);
        int iIndexOfZeroByte = indexOfZeroByte(bArr, 0);
        return new PrivFrame(new String(bArr, 0, iIndexOfZeroByte, C9415C.ISO88591_NAME), copyOfRangeIfValid(bArr, iIndexOfZeroByte + 1, i));
    }

    private static String decodeStringIfValid(byte[] bArr, int i, int i2, String str) throws UnsupportedEncodingException {
        return (i2 <= i || i2 > bArr.length) ? "" : new String(bArr, i, i2 - i, str);
    }

    private static TextInformationFrame decodeTextInformationFrame(ParsableByteArray parsableByteArray, int i, String str) throws UnsupportedEncodingException {
        if (i < 1) {
            return null;
        }
        int unsignedByte = parsableByteArray.readUnsignedByte();
        String charsetName = getCharsetName(unsignedByte);
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        parsableByteArray.readBytes(bArr, 0, i2);
        return new TextInformationFrame(str, null, new String(bArr, 0, indexOfEos(bArr, 0, unsignedByte), charsetName));
    }

    private static TextInformationFrame decodeTxxxFrame(ParsableByteArray parsableByteArray, int i) throws UnsupportedEncodingException {
        if (i < 1) {
            return null;
        }
        int unsignedByte = parsableByteArray.readUnsignedByte();
        String charsetName = getCharsetName(unsignedByte);
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        parsableByteArray.readBytes(bArr, 0, i2);
        int iIndexOfEos = indexOfEos(bArr, 0, unsignedByte);
        String str = new String(bArr, 0, iIndexOfEos, charsetName);
        int iDelimiterLength = iIndexOfEos + delimiterLength(unsignedByte);
        return new TextInformationFrame("TXXX", str, decodeStringIfValid(bArr, iDelimiterLength, indexOfEos(bArr, iDelimiterLength, unsignedByte), charsetName));
    }

    private static UrlLinkFrame decodeUrlLinkFrame(ParsableByteArray parsableByteArray, int i, String str) throws UnsupportedEncodingException {
        byte[] bArr = new byte[i];
        parsableByteArray.readBytes(bArr, 0, i);
        return new UrlLinkFrame(str, null, new String(bArr, 0, indexOfZeroByte(bArr, 0), C9415C.ISO88591_NAME));
    }

    private static UrlLinkFrame decodeWxxxFrame(ParsableByteArray parsableByteArray, int i) throws UnsupportedEncodingException {
        if (i < 1) {
            return null;
        }
        int unsignedByte = parsableByteArray.readUnsignedByte();
        String charsetName = getCharsetName(unsignedByte);
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        parsableByteArray.readBytes(bArr, 0, i2);
        int iIndexOfEos = indexOfEos(bArr, 0, unsignedByte);
        String str = new String(bArr, 0, iIndexOfEos, charsetName);
        int iDelimiterLength = iIndexOfEos + delimiterLength(unsignedByte);
        return new UrlLinkFrame("WXXX", str, decodeStringIfValid(bArr, iDelimiterLength, indexOfZeroByte(bArr, iDelimiterLength), C9415C.ISO88591_NAME));
    }

    private static int delimiterLength(int i) {
        return (i == 0 || i == 3) ? 1 : 2;
    }

    private static String getCharsetName(int i) {
        if (i == 1) {
            return "UTF-16";
        }
        if (i != 2) {
            return i != 3 ? C9415C.ISO88591_NAME : "UTF-8";
        }
        return "UTF-16BE";
    }

    private static String getFrameId(int i, int i2, int i3, int i4, int i5) {
        return i == 2 ? String.format(Locale.US, "%c%c%c", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)) : String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5));
    }

    private static int indexOfEos(byte[] bArr, int i, int i2) {
        int iIndexOfZeroByte = indexOfZeroByte(bArr, i);
        if (i2 == 0 || i2 == 3) {
            return iIndexOfZeroByte;
        }
        while (iIndexOfZeroByte < bArr.length - 1) {
            if (iIndexOfZeroByte % 2 == 0 && bArr[iIndexOfZeroByte + 1] == 0) {
                return iIndexOfZeroByte;
            }
            iIndexOfZeroByte = indexOfZeroByte(bArr, iIndexOfZeroByte + 1);
        }
        return bArr.length;
    }

    private static int indexOfZeroByte(byte[] bArr, int i) {
        while (i < bArr.length) {
            if (bArr[i] == 0) {
                return i;
            }
            i++;
        }
        return bArr.length;
    }

    private static int removeUnsynchronization(ParsableByteArray parsableByteArray, int i) {
        byte[] bArr = parsableByteArray.data;
        int position = parsableByteArray.getPosition();
        while (true) {
            int i2 = position + 1;
            if (i2 >= i) {
                return i;
            }
            if ((bArr[position] & 255) == 255 && bArr[i2] == 0) {
                System.arraycopy(bArr, position + 2, bArr, i2, (i - position) - 2);
                i--;
            }
            position = i2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0087 A[PHI: r3
  0x0087: PHI (r3v16 int) = (r3v5 int), (r3v19 int) binds: [B:39:0x0084, B:31:0x0076] A[DONT_GENERATE, DONT_INLINE]] */
    private static boolean validateFrames(ParsableByteArray parsableByteArray, int i, int i2, boolean z) {
        int unsignedInt24;
        long unsignedInt25;
        int unsignedShort;
        int i3;
        int position = parsableByteArray.getPosition();
        while (true) {
            try {
                boolean z2 = true;
                if (parsableByteArray.bytesLeft() < i2) {
                    parsableByteArray.setPosition(position);
                    return true;
                }
                if (i >= 3) {
                    unsignedInt24 = parsableByteArray.readInt();
                    unsignedInt25 = parsableByteArray.readUnsignedInt();
                    unsignedShort = parsableByteArray.readUnsignedShort();
                } else {
                    unsignedInt24 = parsableByteArray.readUnsignedInt24();
                    unsignedInt25 = parsableByteArray.readUnsignedInt24();
                    unsignedShort = 0;
                }
                if (unsignedInt24 == 0 && unsignedInt25 == 0 && unsignedShort == 0) {
                    parsableByteArray.setPosition(position);
                    return true;
                }
                if (i == 4 && !z) {
                    if ((8421504 & unsignedInt25) != 0) {
                        parsableByteArray.setPosition(position);
                        return false;
                    }
                    unsignedInt25 = (((unsignedInt25 >> 24) & 255) << 21) | (unsignedInt25 & 255) | (((unsignedInt25 >> 8) & 255) << 7) | (((unsignedInt25 >> 16) & 255) << 14);
                }
                if (i == 4) {
                    i3 = (unsignedShort & 64) != 0 ? 1 : 0;
                    if ((unsignedShort & 1) == 0) {
                        z2 = false;
                    }
                } else if (i == 3) {
                    i3 = (unsignedShort & 32) != 0 ? 1 : 0;
                    if ((unsignedShort & 128) == 0) {
                        z2 = false;
                    }
                } else {
                    i3 = 0;
                    z2 = false;
                }
                if (z2) {
                    i3 += 4;
                }
                if (unsignedInt25 < i3) {
                    parsableByteArray.setPosition(position);
                    return false;
                }
                if (parsableByteArray.bytesLeft() < unsignedInt25) {
                    parsableByteArray.setPosition(position);
                    return false;
                }
                parsableByteArray.skipBytes((int) unsignedInt25);
            } catch (Throwable th) {
                parsableByteArray.setPosition(position);
                throw th;
            }
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.metadata.MetadataDecoder
    public Metadata decode(MetadataInputBuffer metadataInputBuffer) {
        ByteBuffer byteBuffer = metadataInputBuffer.data;
        return decode(byteBuffer.array(), byteBuffer.limit());
    }

    public Metadata decode(byte[] bArr, int i) throws Throwable {
        ArrayList arrayList = new ArrayList();
        ParsableByteArray parsableByteArray = new ParsableByteArray(bArr, i);
        Id3Header id3HeaderDecodeHeader = decodeHeader(parsableByteArray);
        if (id3HeaderDecodeHeader == null) {
            return null;
        }
        int position = parsableByteArray.getPosition();
        int i2 = id3HeaderDecodeHeader.majorVersion == 2 ? 6 : 10;
        int iRemoveUnsynchronization = id3HeaderDecodeHeader.framesSize;
        if (id3HeaderDecodeHeader.isUnsynchronized) {
            iRemoveUnsynchronization = removeUnsynchronization(parsableByteArray, id3HeaderDecodeHeader.framesSize);
        }
        parsableByteArray.setLimit(position + iRemoveUnsynchronization);
        boolean z = false;
        if (!validateFrames(parsableByteArray, id3HeaderDecodeHeader.majorVersion, i2, false)) {
            if (id3HeaderDecodeHeader.majorVersion != 4 || !validateFrames(parsableByteArray, 4, i2, true)) {
                Log.w(TAG, "Failed to validate ID3 tag with majorVersion=" + id3HeaderDecodeHeader.majorVersion);
                return null;
            }
            z = true;
        }
        while (parsableByteArray.bytesLeft() >= i2) {
            Id3Frame id3FrameDecodeFrame = decodeFrame(id3HeaderDecodeHeader.majorVersion, parsableByteArray, z, i2, this.framePredicate);
            if (id3FrameDecodeFrame != null) {
                arrayList.add(id3FrameDecodeFrame);
            }
        }
        return new Metadata(arrayList);
    }
}
