package com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4;

import com.adjust.sdk.Constants;
import com.fyber.inneractive.sdk.player.exoplayer2.util.AbstractC8827z;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC8586c {

    /* JADX INFO: renamed from: A0 */
    public static final int f19529A0;

    /* JADX INFO: renamed from: B0 */
    public static final int f19531B0;

    /* JADX INFO: renamed from: C0 */
    public static final int f19533C0;

    /* JADX INFO: renamed from: D0 */
    public static final int f19535D0;

    /* JADX INFO: renamed from: E0 */
    public static final int f19537E0;

    /* JADX INFO: renamed from: F0 */
    public static final int f19539F0;

    /* JADX INFO: renamed from: G0 */
    public static final int f19541G0;

    /* JADX INFO: renamed from: H0 */
    public static final int f19543H0;

    /* JADX INFO: renamed from: I0 */
    public static final int f19545I0;

    /* JADX INFO: renamed from: J0 */
    public static final int f19547J0;

    /* JADX INFO: renamed from: K0 */
    public static final int f19549K0;

    /* JADX INFO: renamed from: L0 */
    public static final int f19551L0;

    /* JADX INFO: renamed from: M0 */
    public static final int f19553M0;

    /* JADX INFO: renamed from: N0 */
    public static final int f19555N0;

    /* JADX INFO: renamed from: O0 */
    public static final int f19557O0;

    /* JADX INFO: renamed from: l0 */
    public static final int f19591l0;

    /* JADX INFO: renamed from: m0 */
    public static final int f19593m0;

    /* JADX INFO: renamed from: n0 */
    public static final int f19595n0;

    /* JADX INFO: renamed from: o0 */
    public static final int f19597o0;

    /* JADX INFO: renamed from: p0 */
    public static final int f19599p0;

    /* JADX INFO: renamed from: q0 */
    public static final int f19601q0;

    /* JADX INFO: renamed from: r0 */
    public static final int f19603r0;

    /* JADX INFO: renamed from: s0 */
    public static final int f19605s0;

    /* JADX INFO: renamed from: t0 */
    public static final int f19607t0;

    /* JADX INFO: renamed from: u0 */
    public static final int f19609u0;

    /* JADX INFO: renamed from: v0 */
    public static final int f19611v0;

    /* JADX INFO: renamed from: w0 */
    public static final int f19613w0;

    /* JADX INFO: renamed from: x0 */
    public static final int f19615x0;

    /* JADX INFO: renamed from: y0 */
    public static final int f19617y0;

    /* JADX INFO: renamed from: z0 */
    public static final int f19619z0;

    /* JADX INFO: renamed from: a */
    public final int f19620a;

    /* JADX INFO: renamed from: b */
    public static final int f19570b = AbstractC8827z.m21379a("ftyp");

    /* JADX INFO: renamed from: c */
    public static final int f19572c = AbstractC8827z.m21379a("avc1");

    /* JADX INFO: renamed from: d */
    public static final int f19574d = AbstractC8827z.m21379a("avc3");

    /* JADX INFO: renamed from: e */
    public static final int f19576e = AbstractC8827z.m21379a("hvc1");

    /* JADX INFO: renamed from: f */
    public static final int f19578f = AbstractC8827z.m21379a("hev1");

    /* JADX INFO: renamed from: g */
    public static final int f19580g = AbstractC8827z.m21379a("s263");

    /* JADX INFO: renamed from: h */
    public static final int f19582h = AbstractC8827z.m21379a("d263");

    /* JADX INFO: renamed from: i */
    public static final int f19584i = AbstractC8827z.m21379a("mdat");

    /* JADX INFO: renamed from: j */
    public static final int f19586j = AbstractC8827z.m21379a("mp4a");

    /* JADX INFO: renamed from: k */
    public static final int f19588k = AbstractC8827z.m21379a(".mp3");

    /* JADX INFO: renamed from: l */
    public static final int f19590l = AbstractC8827z.m21379a("wave");

    /* JADX INFO: renamed from: m */
    public static final int f19592m = AbstractC8827z.m21379a("lpcm");

    /* JADX INFO: renamed from: n */
    public static final int f19594n = AbstractC8827z.m21379a("sowt");

    /* JADX INFO: renamed from: o */
    public static final int f19596o = AbstractC8827z.m21379a("ac-3");

    /* JADX INFO: renamed from: p */
    public static final int f19598p = AbstractC8827z.m21379a("dac3");

    /* JADX INFO: renamed from: q */
    public static final int f19600q = AbstractC8827z.m21379a("ec-3");

    /* JADX INFO: renamed from: r */
    public static final int f19602r = AbstractC8827z.m21379a("dec3");

    /* JADX INFO: renamed from: s */
    public static final int f19604s = AbstractC8827z.m21379a("dtsc");

    /* JADX INFO: renamed from: t */
    public static final int f19606t = AbstractC8827z.m21379a("dtsh");

    /* JADX INFO: renamed from: u */
    public static final int f19608u = AbstractC8827z.m21379a("dtsl");

    /* JADX INFO: renamed from: v */
    public static final int f19610v = AbstractC8827z.m21379a("dtse");

    /* JADX INFO: renamed from: w */
    public static final int f19612w = AbstractC8827z.m21379a("ddts");

    /* JADX INFO: renamed from: x */
    public static final int f19614x = AbstractC8827z.m21379a("tfdt");

    /* JADX INFO: renamed from: y */
    public static final int f19616y = AbstractC8827z.m21379a("tfhd");

    /* JADX INFO: renamed from: z */
    public static final int f19618z = AbstractC8827z.m21379a("trex");

    /* JADX INFO: renamed from: A */
    public static final int f19528A = AbstractC8827z.m21379a("trun");

    /* JADX INFO: renamed from: B */
    public static final int f19530B = AbstractC8827z.m21379a("sidx");

    /* JADX INFO: renamed from: C */
    public static final int f19532C = AbstractC8827z.m21379a("moov");

    /* JADX INFO: renamed from: D */
    public static final int f19534D = AbstractC8827z.m21379a("mvhd");

    /* JADX INFO: renamed from: E */
    public static final int f19536E = AbstractC8827z.m21379a("trak");

    /* JADX INFO: renamed from: F */
    public static final int f19538F = AbstractC8827z.m21379a("mdia");

    /* JADX INFO: renamed from: G */
    public static final int f19540G = AbstractC8827z.m21379a("minf");

    /* JADX INFO: renamed from: H */
    public static final int f19542H = AbstractC8827z.m21379a("stbl");

    /* JADX INFO: renamed from: I */
    public static final int f19544I = AbstractC8827z.m21379a("avcC");

    /* JADX INFO: renamed from: J */
    public static final int f19546J = AbstractC8827z.m21379a("hvcC");

    /* JADX INFO: renamed from: K */
    public static final int f19548K = AbstractC8827z.m21379a("esds");

    /* JADX INFO: renamed from: L */
    public static final int f19550L = AbstractC8827z.m21379a("moof");

    /* JADX INFO: renamed from: M */
    public static final int f19552M = AbstractC8827z.m21379a("traf");

    /* JADX INFO: renamed from: N */
    public static final int f19554N = AbstractC8827z.m21379a("mvex");

    /* JADX INFO: renamed from: O */
    public static final int f19556O = AbstractC8827z.m21379a("mehd");

    /* JADX INFO: renamed from: P */
    public static final int f19558P = AbstractC8827z.m21379a("tkhd");

    /* JADX INFO: renamed from: Q */
    public static final int f19559Q = AbstractC8827z.m21379a("edts");

    /* JADX INFO: renamed from: R */
    public static final int f19560R = AbstractC8827z.m21379a("elst");

    /* JADX INFO: renamed from: S */
    public static final int f19561S = AbstractC8827z.m21379a("mdhd");

    /* JADX INFO: renamed from: T */
    public static final int f19562T = AbstractC8827z.m21379a("hdlr");

    /* JADX INFO: renamed from: U */
    public static final int f19563U = AbstractC8827z.m21379a("stsd");

    /* JADX INFO: renamed from: V */
    public static final int f19564V = AbstractC8827z.m21379a("pssh");

    /* JADX INFO: renamed from: W */
    public static final int f19565W = AbstractC8827z.m21379a("sinf");

    /* JADX INFO: renamed from: X */
    public static final int f19566X = AbstractC8827z.m21379a("schm");

    /* JADX INFO: renamed from: Y */
    public static final int f19567Y = AbstractC8827z.m21379a("schi");

    /* JADX INFO: renamed from: Z */
    public static final int f19568Z = AbstractC8827z.m21379a("tenc");

    /* JADX INFO: renamed from: a0 */
    public static final int f19569a0 = AbstractC8827z.m21379a("encv");

    /* JADX INFO: renamed from: b0 */
    public static final int f19571b0 = AbstractC8827z.m21379a("enca");

    /* JADX INFO: renamed from: c0 */
    public static final int f19573c0 = AbstractC8827z.m21379a("frma");

    /* JADX INFO: renamed from: d0 */
    public static final int f19575d0 = AbstractC8827z.m21379a("saiz");

    /* JADX INFO: renamed from: e0 */
    public static final int f19577e0 = AbstractC8827z.m21379a("saio");

    /* JADX INFO: renamed from: f0 */
    public static final int f19579f0 = AbstractC8827z.m21379a("sbgp");

    /* JADX INFO: renamed from: g0 */
    public static final int f19581g0 = AbstractC8827z.m21379a("sgpd");

    /* JADX INFO: renamed from: h0 */
    public static final int f19583h0 = AbstractC8827z.m21379a("uuid");

    /* JADX INFO: renamed from: i0 */
    public static final int f19585i0 = AbstractC8827z.m21379a("senc");

    /* JADX INFO: renamed from: j0 */
    public static final int f19587j0 = AbstractC8827z.m21379a("pasp");

    /* JADX INFO: renamed from: k0 */
    public static final int f19589k0 = AbstractC8827z.m21379a("TTML");

    static {
        AbstractC8827z.m21379a("vmhd");
        f19591l0 = AbstractC8827z.m21379a("mp4v");
        f19593m0 = AbstractC8827z.m21379a("stts");
        f19595n0 = AbstractC8827z.m21379a("stss");
        f19597o0 = AbstractC8827z.m21379a("ctts");
        f19599p0 = AbstractC8827z.m21379a("stsc");
        f19601q0 = AbstractC8827z.m21379a("stsz");
        f19603r0 = AbstractC8827z.m21379a("stz2");
        f19605s0 = AbstractC8827z.m21379a("stco");
        f19607t0 = AbstractC8827z.m21379a("co64");
        f19609u0 = AbstractC8827z.m21379a("tx3g");
        f19611v0 = AbstractC8827z.m21379a("wvtt");
        f19613w0 = AbstractC8827z.m21379a("stpp");
        f19615x0 = AbstractC8827z.m21379a("c608");
        f19617y0 = AbstractC8827z.m21379a("samr");
        f19619z0 = AbstractC8827z.m21379a("sawb");
        f19529A0 = AbstractC8827z.m21379a("udta");
        f19531B0 = AbstractC8827z.m21379a(Constants.REFERRER_API_META);
        f19533C0 = AbstractC8827z.m21379a("ilst");
        f19535D0 = AbstractC8827z.m21379a("mean");
        f19537E0 = AbstractC8827z.m21379a("name");
        f19539F0 = AbstractC8827z.m21379a("data");
        f19541G0 = AbstractC8827z.m21379a("emsg");
        f19543H0 = AbstractC8827z.m21379a("st3d");
        f19545I0 = AbstractC8827z.m21379a("sv3d");
        f19547J0 = AbstractC8827z.m21379a("proj");
        f19549K0 = AbstractC8827z.m21379a("vp08");
        f19551L0 = AbstractC8827z.m21379a("vp09");
        f19553M0 = AbstractC8827z.m21379a("vpcC");
        f19555N0 = AbstractC8827z.m21379a("camm");
        f19557O0 = AbstractC8827z.m21379a("alac");
    }

    public AbstractC8586c(int i) {
        this.f19620a = i;
    }

    /* JADX INFO: renamed from: a */
    public static String m21123a(int i) {
        return "" + ((char) ((i >> 24) & 255)) + ((char) ((i >> 16) & 255)) + ((char) ((i >> 8) & 255)) + ((char) (i & 255));
    }

    public String toString() {
        return m21123a(this.f19620a);
    }
}
