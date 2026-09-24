package com.applovin.impl;

import androidx.recyclerview.widget.ItemTouchHelper;
import com.applovin.impl.adview.AppLovinTouchToClickListener;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.sdk.AppLovinAdSize;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.ironsource.C11540L6;
import com.ironsource.C11744X3;
import com.ironsource.C12434q2;
import com.ironsource.C12551uc;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.UByte$$ExternalSyntheticBackport0;

/* JADX INFO: renamed from: com.applovin.impl.z4 */
/* JADX INFO: loaded from: classes3.dex */
public class C1831z4 implements Comparable {

    /* JADX INFO: renamed from: A */
    public static final C1831z4 f3670A;

    /* JADX INFO: renamed from: A0 */
    public static final C1831z4 f3671A0;

    /* JADX INFO: renamed from: A1 */
    public static final C1831z4 f3672A1;

    /* JADX INFO: renamed from: A2 */
    public static final C1831z4 f3673A2;

    /* JADX INFO: renamed from: A3 */
    public static final C1831z4 f3674A3;

    /* JADX INFO: renamed from: A4 */
    public static final C1831z4 f3675A4;

    /* JADX INFO: renamed from: A5 */
    public static final C1831z4 f3676A5;

    /* JADX INFO: renamed from: A6 */
    public static final C1831z4 f3677A6;

    /* JADX INFO: renamed from: B */
    public static final C1831z4 f3678B;

    /* JADX INFO: renamed from: B0 */
    public static final C1831z4 f3679B0;

    /* JADX INFO: renamed from: B1 */
    public static final C1831z4 f3680B1;

    /* JADX INFO: renamed from: B2 */
    public static final C1831z4 f3681B2;

    /* JADX INFO: renamed from: B3 */
    public static final C1831z4 f3682B3;

    /* JADX INFO: renamed from: B4 */
    public static final C1831z4 f3683B4;

    /* JADX INFO: renamed from: B5 */
    public static final C1831z4 f3684B5;

    /* JADX INFO: renamed from: B6 */
    public static final C1831z4 f3685B6;

    /* JADX INFO: renamed from: C */
    public static final C1831z4 f3686C;

    /* JADX INFO: renamed from: C0 */
    public static final C1831z4 f3687C0;

    /* JADX INFO: renamed from: C1 */
    public static final C1831z4 f3688C1;

    /* JADX INFO: renamed from: C2 */
    public static final C1831z4 f3689C2;

    /* JADX INFO: renamed from: C3 */
    public static final C1831z4 f3690C3;

    /* JADX INFO: renamed from: C4 */
    public static final C1831z4 f3691C4;

    /* JADX INFO: renamed from: C5 */
    public static final C1831z4 f3692C5;

    /* JADX INFO: renamed from: C6 */
    public static final C1831z4 f3693C6;

    /* JADX INFO: renamed from: D */
    public static final C1831z4 f3694D;

    /* JADX INFO: renamed from: D0 */
    public static final C1831z4 f3695D0;

    /* JADX INFO: renamed from: D1 */
    public static final C1831z4 f3696D1;

    /* JADX INFO: renamed from: D2 */
    public static final C1831z4 f3697D2;

    /* JADX INFO: renamed from: D3 */
    public static final C1831z4 f3698D3;

    /* JADX INFO: renamed from: D4 */
    public static final C1831z4 f3699D4;

    /* JADX INFO: renamed from: D5 */
    public static final C1831z4 f3700D5;

    /* JADX INFO: renamed from: D6 */
    public static final C1831z4 f3701D6;

    /* JADX INFO: renamed from: E */
    public static final C1831z4 f3702E;

    /* JADX INFO: renamed from: E0 */
    public static final C1831z4 f3703E0;

    /* JADX INFO: renamed from: E1 */
    public static final C1831z4 f3704E1;

    /* JADX INFO: renamed from: E2 */
    public static final C1831z4 f3705E2;

    /* JADX INFO: renamed from: E3 */
    public static final C1831z4 f3706E3;

    /* JADX INFO: renamed from: E4 */
    public static final C1831z4 f3707E4;

    /* JADX INFO: renamed from: E5 */
    public static final C1831z4 f3708E5;

    /* JADX INFO: renamed from: E6 */
    public static final C1831z4 f3709E6;

    /* JADX INFO: renamed from: F */
    public static final C1831z4 f3710F;

    /* JADX INFO: renamed from: F0 */
    public static final C1831z4 f3711F0;

    /* JADX INFO: renamed from: F1 */
    public static final C1831z4 f3712F1;

    /* JADX INFO: renamed from: F2 */
    public static final C1831z4 f3713F2;

    /* JADX INFO: renamed from: F3 */
    public static final C1831z4 f3714F3;

    /* JADX INFO: renamed from: F4 */
    public static final C1831z4 f3715F4;

    /* JADX INFO: renamed from: F5 */
    public static final C1831z4 f3716F5;

    /* JADX INFO: renamed from: F6 */
    public static final C1831z4 f3717F6;

    /* JADX INFO: renamed from: G */
    public static final C1831z4 f3718G;

    /* JADX INFO: renamed from: G0 */
    public static final C1831z4 f3719G0;

    /* JADX INFO: renamed from: G1 */
    public static final C1831z4 f3720G1;

    /* JADX INFO: renamed from: G2 */
    public static final C1831z4 f3721G2;

    /* JADX INFO: renamed from: G3 */
    public static final C1831z4 f3722G3;

    /* JADX INFO: renamed from: G4 */
    public static final C1831z4 f3723G4;

    /* JADX INFO: renamed from: G5 */
    public static final C1831z4 f3724G5;

    /* JADX INFO: renamed from: G6 */
    public static final C1831z4 f3725G6;

    /* JADX INFO: renamed from: H */
    public static final C1831z4 f3726H;

    /* JADX INFO: renamed from: H0 */
    public static final C1831z4 f3727H0;

    /* JADX INFO: renamed from: H1 */
    public static final C1831z4 f3728H1;

    /* JADX INFO: renamed from: H2 */
    public static final C1831z4 f3729H2;

    /* JADX INFO: renamed from: H3 */
    public static final C1831z4 f3730H3;

    /* JADX INFO: renamed from: H4 */
    public static final C1831z4 f3731H4;

    /* JADX INFO: renamed from: H5 */
    public static final C1831z4 f3732H5;

    /* JADX INFO: renamed from: H6 */
    public static final C1831z4 f3733H6;

    /* JADX INFO: renamed from: I */
    public static final C1831z4 f3734I;

    /* JADX INFO: renamed from: I0 */
    public static final C1831z4 f3735I0;

    /* JADX INFO: renamed from: I1 */
    public static final C1831z4 f3736I1;

    /* JADX INFO: renamed from: I2 */
    public static final C1831z4 f3737I2;

    /* JADX INFO: renamed from: I3 */
    public static final C1831z4 f3738I3;

    /* JADX INFO: renamed from: I4 */
    public static final C1831z4 f3739I4;

    /* JADX INFO: renamed from: I5 */
    public static final C1831z4 f3740I5;

    /* JADX INFO: renamed from: I6 */
    public static final C1831z4 f3741I6;

    /* JADX INFO: renamed from: J */
    public static final C1831z4 f3742J;

    /* JADX INFO: renamed from: J0 */
    public static final C1831z4 f3743J0;

    /* JADX INFO: renamed from: J1 */
    public static final C1831z4 f3744J1;

    /* JADX INFO: renamed from: J2 */
    public static final C1831z4 f3745J2;

    /* JADX INFO: renamed from: J3 */
    public static final C1831z4 f3746J3;

    /* JADX INFO: renamed from: J4 */
    public static final C1831z4 f3747J4;

    /* JADX INFO: renamed from: J5 */
    public static final C1831z4 f3748J5;

    /* JADX INFO: renamed from: J6 */
    public static final C1831z4 f3749J6;

    /* JADX INFO: renamed from: K */
    public static final C1831z4 f3750K;

    /* JADX INFO: renamed from: K0 */
    public static final C1831z4 f3751K0;

    /* JADX INFO: renamed from: K1 */
    public static final C1831z4 f3752K1;

    /* JADX INFO: renamed from: K2 */
    public static final C1831z4 f3753K2;

    /* JADX INFO: renamed from: K3 */
    public static final C1831z4 f3754K3;

    /* JADX INFO: renamed from: K4 */
    public static final C1831z4 f3755K4;

    /* JADX INFO: renamed from: K5 */
    public static final C1831z4 f3756K5;

    /* JADX INFO: renamed from: K6 */
    public static final C1831z4 f3757K6;

    /* JADX INFO: renamed from: L */
    public static final C1831z4 f3758L;

    /* JADX INFO: renamed from: L0 */
    public static final C1831z4 f3759L0;

    /* JADX INFO: renamed from: L1 */
    public static final C1831z4 f3760L1;

    /* JADX INFO: renamed from: L2 */
    public static final C1831z4 f3761L2;

    /* JADX INFO: renamed from: L3 */
    public static final C1831z4 f3762L3;

    /* JADX INFO: renamed from: L4 */
    public static final C1831z4 f3763L4;

    /* JADX INFO: renamed from: L5 */
    public static final C1831z4 f3764L5;

    /* JADX INFO: renamed from: L6 */
    public static final C1831z4 f3765L6;

    /* JADX INFO: renamed from: M */
    public static final C1831z4 f3766M;

    /* JADX INFO: renamed from: M0 */
    public static final C1831z4 f3767M0;

    /* JADX INFO: renamed from: M1 */
    public static final C1831z4 f3768M1;

    /* JADX INFO: renamed from: M2 */
    public static final C1831z4 f3769M2;

    /* JADX INFO: renamed from: M3 */
    public static final C1831z4 f3770M3;

    /* JADX INFO: renamed from: M4 */
    public static final C1831z4 f3771M4;

    /* JADX INFO: renamed from: M5 */
    public static final C1831z4 f3772M5;

    /* JADX INFO: renamed from: M6 */
    public static final C1831z4 f3773M6;

    /* JADX INFO: renamed from: N */
    public static final C1831z4 f3774N;

    /* JADX INFO: renamed from: N0 */
    public static final C1831z4 f3775N0;

    /* JADX INFO: renamed from: N1 */
    public static final C1831z4 f3776N1;

    /* JADX INFO: renamed from: N2 */
    public static final C1831z4 f3777N2;

    /* JADX INFO: renamed from: N3 */
    public static final C1831z4 f3778N3;

    /* JADX INFO: renamed from: N4 */
    public static final C1831z4 f3779N4;

    /* JADX INFO: renamed from: N5 */
    public static final C1831z4 f3780N5;

    /* JADX INFO: renamed from: N6 */
    public static final C1831z4 f3781N6;

    /* JADX INFO: renamed from: O */
    public static final C1831z4 f3782O;

    /* JADX INFO: renamed from: O0 */
    public static final C1831z4 f3783O0;

    /* JADX INFO: renamed from: O1 */
    public static final C1831z4 f3784O1;

    /* JADX INFO: renamed from: O2 */
    public static final C1831z4 f3785O2;

    /* JADX INFO: renamed from: O3 */
    public static final C1831z4 f3786O3;

    /* JADX INFO: renamed from: O4 */
    public static final C1831z4 f3787O4;

    /* JADX INFO: renamed from: O5 */
    public static final C1831z4 f3788O5;

    /* JADX INFO: renamed from: O6 */
    public static final C1831z4 f3789O6;

    /* JADX INFO: renamed from: P */
    public static final C1831z4 f3790P;

    /* JADX INFO: renamed from: P0 */
    public static final C1831z4 f3791P0;

    /* JADX INFO: renamed from: P1 */
    public static final C1831z4 f3792P1;

    /* JADX INFO: renamed from: P2 */
    public static final C1831z4 f3793P2;

    /* JADX INFO: renamed from: P3 */
    public static final C1831z4 f3794P3;

    /* JADX INFO: renamed from: P4 */
    public static final C1831z4 f3795P4;

    /* JADX INFO: renamed from: P5 */
    public static final C1831z4 f3796P5;

    /* JADX INFO: renamed from: P6 */
    public static final C1831z4 f3797P6;

    /* JADX INFO: renamed from: Q */
    public static final C1831z4 f3798Q;

    /* JADX INFO: renamed from: Q0 */
    public static final C1831z4 f3799Q0;

    /* JADX INFO: renamed from: Q1 */
    public static final C1831z4 f3800Q1;

    /* JADX INFO: renamed from: Q2 */
    public static final C1831z4 f3801Q2;

    /* JADX INFO: renamed from: Q3 */
    public static final C1831z4 f3802Q3;

    /* JADX INFO: renamed from: Q4 */
    public static final C1831z4 f3803Q4;

    /* JADX INFO: renamed from: Q5 */
    public static final C1831z4 f3804Q5;

    /* JADX INFO: renamed from: Q6 */
    public static final C1831z4 f3805Q6;

    /* JADX INFO: renamed from: R */
    public static final C1831z4 f3806R;

    /* JADX INFO: renamed from: R0 */
    public static final C1831z4 f3807R0;

    /* JADX INFO: renamed from: R1 */
    public static final C1831z4 f3808R1;

    /* JADX INFO: renamed from: R2 */
    public static final C1831z4 f3809R2;

    /* JADX INFO: renamed from: R3 */
    public static final C1831z4 f3810R3;

    /* JADX INFO: renamed from: R4 */
    public static final C1831z4 f3811R4;

    /* JADX INFO: renamed from: R5 */
    public static final C1831z4 f3812R5;

    /* JADX INFO: renamed from: R6 */
    public static final C1831z4 f3813R6;

    /* JADX INFO: renamed from: S */
    public static final C1831z4 f3814S;

    /* JADX INFO: renamed from: S0 */
    public static final C1831z4 f3815S0;

    /* JADX INFO: renamed from: S1 */
    public static final C1831z4 f3816S1;

    /* JADX INFO: renamed from: S2 */
    public static final C1831z4 f3817S2;

    /* JADX INFO: renamed from: S3 */
    public static final C1831z4 f3818S3;

    /* JADX INFO: renamed from: S4 */
    public static final C1831z4 f3819S4;

    /* JADX INFO: renamed from: S5 */
    public static final C1831z4 f3820S5;

    /* JADX INFO: renamed from: S6 */
    public static final C1831z4 f3821S6;

    /* JADX INFO: renamed from: T */
    public static final C1831z4 f3822T;

    /* JADX INFO: renamed from: T0 */
    public static final C1831z4 f3823T0;

    /* JADX INFO: renamed from: T1 */
    public static final C1831z4 f3824T1;

    /* JADX INFO: renamed from: T2 */
    public static final C1831z4 f3825T2;

    /* JADX INFO: renamed from: T3 */
    public static final C1831z4 f3826T3;

    /* JADX INFO: renamed from: T4 */
    public static final C1831z4 f3827T4;

    /* JADX INFO: renamed from: T5 */
    public static final C1831z4 f3828T5;

    /* JADX INFO: renamed from: T6 */
    public static final C1831z4 f3829T6;

    /* JADX INFO: renamed from: U */
    public static final C1831z4 f3830U;

    /* JADX INFO: renamed from: U0 */
    public static final C1831z4 f3831U0;

    /* JADX INFO: renamed from: U1 */
    public static final C1831z4 f3832U1;

    /* JADX INFO: renamed from: U2 */
    public static final C1831z4 f3833U2;

    /* JADX INFO: renamed from: U3 */
    public static final C1831z4 f3834U3;

    /* JADX INFO: renamed from: U4 */
    public static final C1831z4 f3835U4;

    /* JADX INFO: renamed from: U5 */
    public static final C1831z4 f3836U5;

    /* JADX INFO: renamed from: U6 */
    public static final C1831z4 f3837U6;

    /* JADX INFO: renamed from: V */
    public static final C1831z4 f3838V;

    /* JADX INFO: renamed from: V0 */
    public static final C1831z4 f3839V0;

    /* JADX INFO: renamed from: V1 */
    public static final C1831z4 f3840V1;

    /* JADX INFO: renamed from: V2 */
    public static final C1831z4 f3841V2;

    /* JADX INFO: renamed from: V3 */
    public static final C1831z4 f3842V3;

    /* JADX INFO: renamed from: V4 */
    public static final C1831z4 f3843V4;

    /* JADX INFO: renamed from: V5 */
    public static final C1831z4 f3844V5;

    /* JADX INFO: renamed from: V6 */
    public static final C1831z4 f3845V6;

    /* JADX INFO: renamed from: W */
    public static final C1831z4 f3846W;

    /* JADX INFO: renamed from: W0 */
    public static final C1831z4 f3847W0;

    /* JADX INFO: renamed from: W1 */
    public static final C1831z4 f3848W1;

    /* JADX INFO: renamed from: W2 */
    public static final C1831z4 f3849W2;

    /* JADX INFO: renamed from: W3 */
    public static final C1831z4 f3850W3;

    /* JADX INFO: renamed from: W4 */
    public static final C1831z4 f3851W4;

    /* JADX INFO: renamed from: W5 */
    public static final C1831z4 f3852W5;

    /* JADX INFO: renamed from: W6 */
    public static final C1831z4 f3853W6;

    /* JADX INFO: renamed from: X */
    public static final C1831z4 f3854X;

    /* JADX INFO: renamed from: X0 */
    public static final C1831z4 f3855X0;

    /* JADX INFO: renamed from: X1 */
    public static final C1831z4 f3856X1;

    /* JADX INFO: renamed from: X2 */
    public static final C1831z4 f3857X2;

    /* JADX INFO: renamed from: X3 */
    public static final C1831z4 f3858X3;

    /* JADX INFO: renamed from: X4 */
    public static final C1831z4 f3859X4;

    /* JADX INFO: renamed from: X5 */
    public static final C1831z4 f3860X5;

    /* JADX INFO: renamed from: X6 */
    public static final C1831z4 f3861X6;

    /* JADX INFO: renamed from: Y */
    public static final C1831z4 f3862Y;

    /* JADX INFO: renamed from: Y0 */
    public static final C1831z4 f3863Y0;

    /* JADX INFO: renamed from: Y1 */
    public static final C1831z4 f3864Y1;

    /* JADX INFO: renamed from: Y2 */
    public static final C1831z4 f3865Y2;

    /* JADX INFO: renamed from: Y3 */
    public static final C1831z4 f3866Y3;

    /* JADX INFO: renamed from: Y4 */
    public static final C1831z4 f3867Y4;

    /* JADX INFO: renamed from: Y5 */
    public static final C1831z4 f3868Y5;

    /* JADX INFO: renamed from: Y6 */
    public static final C1831z4 f3869Y6;

    /* JADX INFO: renamed from: Z */
    public static final C1831z4 f3870Z;

    /* JADX INFO: renamed from: Z0 */
    public static final C1831z4 f3871Z0;

    /* JADX INFO: renamed from: Z1 */
    public static final C1831z4 f3872Z1;

    /* JADX INFO: renamed from: Z2 */
    public static final C1831z4 f3873Z2;

    /* JADX INFO: renamed from: Z3 */
    public static final C1831z4 f3874Z3;

    /* JADX INFO: renamed from: Z4 */
    public static final C1831z4 f3875Z4;

    /* JADX INFO: renamed from: Z5 */
    public static final C1831z4 f3876Z5;

    /* JADX INFO: renamed from: Z6 */
    public static final C1831z4 f3877Z6;

    /* JADX INFO: renamed from: a0 */
    public static final C1831z4 f3878a0;

    /* JADX INFO: renamed from: a1 */
    public static final C1831z4 f3879a1;

    /* JADX INFO: renamed from: a2 */
    public static final C1831z4 f3880a2;

    /* JADX INFO: renamed from: a3 */
    public static final C1831z4 f3881a3;

    /* JADX INFO: renamed from: a4 */
    public static final C1831z4 f3882a4;

    /* JADX INFO: renamed from: a5 */
    public static final C1831z4 f3883a5;

    /* JADX INFO: renamed from: a6 */
    public static final C1831z4 f3884a6;

    /* JADX INFO: renamed from: a7 */
    public static final C1831z4 f3885a7;

    /* JADX INFO: renamed from: b0 */
    public static final C1831z4 f3886b0;

    /* JADX INFO: renamed from: b1 */
    public static final C1831z4 f3887b1;

    /* JADX INFO: renamed from: b2 */
    public static final C1831z4 f3888b2;

    /* JADX INFO: renamed from: b3 */
    public static final C1831z4 f3889b3;

    /* JADX INFO: renamed from: b4 */
    public static final C1831z4 f3890b4;

    /* JADX INFO: renamed from: b5 */
    public static final C1831z4 f3891b5;

    /* JADX INFO: renamed from: b6 */
    public static final C1831z4 f3892b6;

    /* JADX INFO: renamed from: b7 */
    public static final C1831z4 f3893b7;

    /* JADX INFO: renamed from: c0 */
    public static final C1831z4 f3895c0;

    /* JADX INFO: renamed from: c1 */
    public static final C1831z4 f3896c1;

    /* JADX INFO: renamed from: c2 */
    public static final C1831z4 f3897c2;

    /* JADX INFO: renamed from: c3 */
    public static final C1831z4 f3898c3;

    /* JADX INFO: renamed from: c4 */
    public static final C1831z4 f3899c4;

    /* JADX INFO: renamed from: c5 */
    public static final C1831z4 f3900c5;

    /* JADX INFO: renamed from: c6 */
    public static final C1831z4 f3901c6;

    /* JADX INFO: renamed from: c7 */
    public static final C1831z4 f3902c7;

    /* JADX INFO: renamed from: d0 */
    public static final C1831z4 f3904d0;

    /* JADX INFO: renamed from: d1 */
    public static final C1831z4 f3905d1;

    /* JADX INFO: renamed from: d2 */
    public static final C1831z4 f3906d2;

    /* JADX INFO: renamed from: d3 */
    public static final C1831z4 f3907d3;

    /* JADX INFO: renamed from: d4 */
    public static final C1831z4 f3908d4;

    /* JADX INFO: renamed from: d5 */
    public static final C1831z4 f3909d5;

    /* JADX INFO: renamed from: d6 */
    public static final C1831z4 f3910d6;

    /* JADX INFO: renamed from: d7 */
    public static final C1831z4 f3911d7;

    /* JADX INFO: renamed from: e */
    public static final C1831z4 f3912e;

    /* JADX INFO: renamed from: e0 */
    public static final C1831z4 f3913e0;

    /* JADX INFO: renamed from: e1 */
    public static final C1831z4 f3914e1;

    /* JADX INFO: renamed from: e2 */
    public static final C1831z4 f3915e2;

    /* JADX INFO: renamed from: e3 */
    public static final C1831z4 f3916e3;

    /* JADX INFO: renamed from: e4 */
    public static final C1831z4 f3917e4;

    /* JADX INFO: renamed from: e5 */
    public static final C1831z4 f3918e5;

    /* JADX INFO: renamed from: e6 */
    public static final C1831z4 f3919e6;

    /* JADX INFO: renamed from: e7 */
    public static final C1831z4 f3920e7;

    /* JADX INFO: renamed from: f */
    public static final C1831z4 f3921f;

    /* JADX INFO: renamed from: f0 */
    public static final C1831z4 f3922f0;

    /* JADX INFO: renamed from: f1 */
    public static final C1831z4 f3923f1;

    /* JADX INFO: renamed from: f2 */
    public static final C1831z4 f3924f2;

    /* JADX INFO: renamed from: f3 */
    public static final C1831z4 f3925f3;

    /* JADX INFO: renamed from: f4 */
    public static final C1831z4 f3926f4;

    /* JADX INFO: renamed from: f5 */
    public static final C1831z4 f3927f5;

    /* JADX INFO: renamed from: f6 */
    public static final C1831z4 f3928f6;

    /* JADX INFO: renamed from: f7 */
    public static final C1831z4 f3929f7;

    /* JADX INFO: renamed from: g */
    public static final C1831z4 f3930g;

    /* JADX INFO: renamed from: g0 */
    public static final C1831z4 f3931g0;

    /* JADX INFO: renamed from: g1 */
    public static final C1831z4 f3932g1;

    /* JADX INFO: renamed from: g2 */
    public static final C1831z4 f3933g2;

    /* JADX INFO: renamed from: g3 */
    public static final C1831z4 f3934g3;

    /* JADX INFO: renamed from: g4 */
    public static final C1831z4 f3935g4;

    /* JADX INFO: renamed from: g5 */
    public static final C1831z4 f3936g5;

    /* JADX INFO: renamed from: g6 */
    public static final C1831z4 f3937g6;

    /* JADX INFO: renamed from: g7 */
    public static final C1831z4 f3938g7;

    /* JADX INFO: renamed from: h */
    public static final C1831z4 f3939h;

    /* JADX INFO: renamed from: h0 */
    public static final C1831z4 f3940h0;

    /* JADX INFO: renamed from: h1 */
    public static final C1831z4 f3941h1;

    /* JADX INFO: renamed from: h2 */
    public static final C1831z4 f3942h2;

    /* JADX INFO: renamed from: h3 */
    public static final C1831z4 f3943h3;

    /* JADX INFO: renamed from: h4 */
    public static final C1831z4 f3944h4;

    /* JADX INFO: renamed from: h5 */
    public static final C1831z4 f3945h5;

    /* JADX INFO: renamed from: h6 */
    public static final C1831z4 f3946h6;

    /* JADX INFO: renamed from: h7 */
    public static final C1831z4 f3947h7;

    /* JADX INFO: renamed from: i */
    public static final C1831z4 f3948i;

    /* JADX INFO: renamed from: i0 */
    public static final C1831z4 f3949i0;

    /* JADX INFO: renamed from: i1 */
    public static final C1831z4 f3950i1;

    /* JADX INFO: renamed from: i2 */
    public static final C1831z4 f3951i2;

    /* JADX INFO: renamed from: i3 */
    public static final C1831z4 f3952i3;

    /* JADX INFO: renamed from: i4 */
    public static final C1831z4 f3953i4;

    /* JADX INFO: renamed from: i5 */
    public static final C1831z4 f3954i5;

    /* JADX INFO: renamed from: i6 */
    public static final C1831z4 f3955i6;

    /* JADX INFO: renamed from: i7 */
    public static final C1831z4 f3956i7;

    /* JADX INFO: renamed from: j */
    public static final C1831z4 f3957j;

    /* JADX INFO: renamed from: j0 */
    public static final C1831z4 f3958j0;

    /* JADX INFO: renamed from: j1 */
    public static final C1831z4 f3959j1;

    /* JADX INFO: renamed from: j2 */
    public static final C1831z4 f3960j2;

    /* JADX INFO: renamed from: j3 */
    public static final C1831z4 f3961j3;

    /* JADX INFO: renamed from: j4 */
    public static final C1831z4 f3962j4;

    /* JADX INFO: renamed from: j5 */
    public static final C1831z4 f3963j5;

    /* JADX INFO: renamed from: j6 */
    public static final C1831z4 f3964j6;

    /* JADX INFO: renamed from: j7 */
    public static final C1831z4 f3965j7;

    /* JADX INFO: renamed from: k */
    public static final C1831z4 f3966k;

    /* JADX INFO: renamed from: k0 */
    public static final C1831z4 f3967k0;

    /* JADX INFO: renamed from: k1 */
    public static final C1831z4 f3968k1;

    /* JADX INFO: renamed from: k2 */
    public static final C1831z4 f3969k2;

    /* JADX INFO: renamed from: k3 */
    public static final C1831z4 f3970k3;

    /* JADX INFO: renamed from: k4 */
    public static final C1831z4 f3971k4;

    /* JADX INFO: renamed from: k5 */
    public static final C1831z4 f3972k5;

    /* JADX INFO: renamed from: k6 */
    public static final C1831z4 f3973k6;

    /* JADX INFO: renamed from: k7 */
    public static final C1831z4 f3974k7;

    /* JADX INFO: renamed from: l */
    public static final C1831z4 f3975l;

    /* JADX INFO: renamed from: l0 */
    public static final C1831z4 f3976l0;

    /* JADX INFO: renamed from: l1 */
    public static final C1831z4 f3977l1;

    /* JADX INFO: renamed from: l2 */
    public static final C1831z4 f3978l2;

    /* JADX INFO: renamed from: l3 */
    public static final C1831z4 f3979l3;

    /* JADX INFO: renamed from: l4 */
    public static final C1831z4 f3980l4;

    /* JADX INFO: renamed from: l5 */
    public static final C1831z4 f3981l5;

    /* JADX INFO: renamed from: l6 */
    public static final C1831z4 f3982l6;

    /* JADX INFO: renamed from: l7 */
    public static final C1831z4 f3983l7;

    /* JADX INFO: renamed from: m */
    public static final C1831z4 f3984m;

    /* JADX INFO: renamed from: m0 */
    public static final C1831z4 f3985m0;

    /* JADX INFO: renamed from: m1 */
    public static final C1831z4 f3986m1;

    /* JADX INFO: renamed from: m2 */
    public static final C1831z4 f3987m2;

    /* JADX INFO: renamed from: m3 */
    public static final C1831z4 f3988m3;

    /* JADX INFO: renamed from: m4 */
    public static final C1831z4 f3989m4;

    /* JADX INFO: renamed from: m5 */
    public static final C1831z4 f3990m5;

    /* JADX INFO: renamed from: m6 */
    public static final C1831z4 f3991m6;

    /* JADX INFO: renamed from: m7 */
    public static final C1831z4 f3992m7;

    /* JADX INFO: renamed from: n */
    public static final C1831z4 f3993n;

    /* JADX INFO: renamed from: n0 */
    public static final C1831z4 f3994n0;

    /* JADX INFO: renamed from: n1 */
    public static final C1831z4 f3995n1;

    /* JADX INFO: renamed from: n2 */
    public static final C1831z4 f3996n2;

    /* JADX INFO: renamed from: n3 */
    public static final C1831z4 f3997n3;

    /* JADX INFO: renamed from: n4 */
    public static final C1831z4 f3998n4;

    /* JADX INFO: renamed from: n5 */
    public static final C1831z4 f3999n5;

    /* JADX INFO: renamed from: n6 */
    public static final C1831z4 f4000n6;

    /* JADX INFO: renamed from: n7 */
    public static final C1831z4 f4001n7;

    /* JADX INFO: renamed from: o */
    public static final C1831z4 f4002o;

    /* JADX INFO: renamed from: o0 */
    public static final C1831z4 f4003o0;

    /* JADX INFO: renamed from: o1 */
    public static final C1831z4 f4004o1;

    /* JADX INFO: renamed from: o2 */
    public static final C1831z4 f4005o2;

    /* JADX INFO: renamed from: o3 */
    public static final C1831z4 f4006o3;

    /* JADX INFO: renamed from: o4 */
    public static final C1831z4 f4007o4;

    /* JADX INFO: renamed from: o5 */
    public static final C1831z4 f4008o5;

    /* JADX INFO: renamed from: o6 */
    public static final C1831z4 f4009o6;

    /* JADX INFO: renamed from: p */
    public static final C1831z4 f4010p;

    /* JADX INFO: renamed from: p0 */
    public static final C1831z4 f4011p0;

    /* JADX INFO: renamed from: p1 */
    public static final C1831z4 f4012p1;

    /* JADX INFO: renamed from: p2 */
    public static final C1831z4 f4013p2;

    /* JADX INFO: renamed from: p3 */
    public static final C1831z4 f4014p3;

    /* JADX INFO: renamed from: p4 */
    public static final C1831z4 f4015p4;

    /* JADX INFO: renamed from: p5 */
    public static final C1831z4 f4016p5;

    /* JADX INFO: renamed from: p6 */
    public static final C1831z4 f4017p6;

    /* JADX INFO: renamed from: q */
    public static final C1831z4 f4018q;

    /* JADX INFO: renamed from: q0 */
    public static final C1831z4 f4019q0;

    /* JADX INFO: renamed from: q1 */
    public static final C1831z4 f4020q1;

    /* JADX INFO: renamed from: q2 */
    public static final C1831z4 f4021q2;

    /* JADX INFO: renamed from: q3 */
    public static final C1831z4 f4022q3;

    /* JADX INFO: renamed from: q4 */
    public static final C1831z4 f4023q4;

    /* JADX INFO: renamed from: q5 */
    public static final C1831z4 f4024q5;

    /* JADX INFO: renamed from: q6 */
    public static final C1831z4 f4025q6;

    /* JADX INFO: renamed from: r */
    public static final C1831z4 f4026r;

    /* JADX INFO: renamed from: r0 */
    public static final C1831z4 f4027r0;

    /* JADX INFO: renamed from: r1 */
    public static final C1831z4 f4028r1;

    /* JADX INFO: renamed from: r2 */
    public static final C1831z4 f4029r2;

    /* JADX INFO: renamed from: r3 */
    public static final C1831z4 f4030r3;

    /* JADX INFO: renamed from: r4 */
    public static final C1831z4 f4031r4;

    /* JADX INFO: renamed from: r5 */
    public static final C1831z4 f4032r5;

    /* JADX INFO: renamed from: r6 */
    public static final C1831z4 f4033r6;

    /* JADX INFO: renamed from: s */
    public static final C1831z4 f4034s;

    /* JADX INFO: renamed from: s0 */
    public static final C1831z4 f4035s0;

    /* JADX INFO: renamed from: s1 */
    public static final C1831z4 f4036s1;

    /* JADX INFO: renamed from: s2 */
    public static final C1831z4 f4037s2;

    /* JADX INFO: renamed from: s3 */
    public static final C1831z4 f4038s3;

    /* JADX INFO: renamed from: s4 */
    public static final C1831z4 f4039s4;

    /* JADX INFO: renamed from: s5 */
    public static final C1831z4 f4040s5;

    /* JADX INFO: renamed from: s6 */
    public static final C1831z4 f4041s6;

    /* JADX INFO: renamed from: t */
    public static final C1831z4 f4042t;

    /* JADX INFO: renamed from: t0 */
    public static final C1831z4 f4043t0;

    /* JADX INFO: renamed from: t1 */
    public static final C1831z4 f4044t1;

    /* JADX INFO: renamed from: t2 */
    public static final C1831z4 f4045t2;

    /* JADX INFO: renamed from: t3 */
    public static final C1831z4 f4046t3;

    /* JADX INFO: renamed from: t4 */
    public static final C1831z4 f4047t4;

    /* JADX INFO: renamed from: t5 */
    public static final C1831z4 f4048t5;

    /* JADX INFO: renamed from: t6 */
    public static final C1831z4 f4049t6;

    /* JADX INFO: renamed from: u */
    public static final C1831z4 f4050u;

    /* JADX INFO: renamed from: u0 */
    public static final C1831z4 f4051u0;

    /* JADX INFO: renamed from: u1 */
    public static final C1831z4 f4052u1;

    /* JADX INFO: renamed from: u2 */
    public static final C1831z4 f4053u2;

    /* JADX INFO: renamed from: u3 */
    public static final C1831z4 f4054u3;

    /* JADX INFO: renamed from: u4 */
    public static final C1831z4 f4055u4;

    /* JADX INFO: renamed from: u5 */
    public static final C1831z4 f4056u5;

    /* JADX INFO: renamed from: u6 */
    public static final C1831z4 f4057u6;

    /* JADX INFO: renamed from: v */
    public static final C1831z4 f4058v;

    /* JADX INFO: renamed from: v0 */
    public static final C1831z4 f4059v0;

    /* JADX INFO: renamed from: v1 */
    public static final C1831z4 f4060v1;

    /* JADX INFO: renamed from: v2 */
    public static final C1831z4 f4061v2;

    /* JADX INFO: renamed from: v3 */
    public static final C1831z4 f4062v3;

    /* JADX INFO: renamed from: v4 */
    public static final C1831z4 f4063v4;

    /* JADX INFO: renamed from: v5 */
    public static final C1831z4 f4064v5;

    /* JADX INFO: renamed from: v6 */
    public static final C1831z4 f4065v6;

    /* JADX INFO: renamed from: w */
    public static final C1831z4 f4066w;

    /* JADX INFO: renamed from: w0 */
    public static final C1831z4 f4067w0;

    /* JADX INFO: renamed from: w1 */
    public static final C1831z4 f4068w1;

    /* JADX INFO: renamed from: w2 */
    public static final C1831z4 f4069w2;

    /* JADX INFO: renamed from: w3 */
    public static final C1831z4 f4070w3;

    /* JADX INFO: renamed from: w4 */
    public static final C1831z4 f4071w4;

    /* JADX INFO: renamed from: w5 */
    public static final C1831z4 f4072w5;

    /* JADX INFO: renamed from: w6 */
    public static final C1831z4 f4073w6;

    /* JADX INFO: renamed from: x */
    public static final C1831z4 f4074x;

    /* JADX INFO: renamed from: x0 */
    public static final C1831z4 f4075x0;

    /* JADX INFO: renamed from: x1 */
    public static final C1831z4 f4076x1;

    /* JADX INFO: renamed from: x2 */
    public static final C1831z4 f4077x2;

    /* JADX INFO: renamed from: x3 */
    public static final C1831z4 f4078x3;

    /* JADX INFO: renamed from: x4 */
    public static final C1831z4 f4079x4;

    /* JADX INFO: renamed from: x5 */
    public static final C1831z4 f4080x5;

    /* JADX INFO: renamed from: x6 */
    public static final C1831z4 f4081x6;

    /* JADX INFO: renamed from: y */
    public static final C1831z4 f4082y;

    /* JADX INFO: renamed from: y0 */
    public static final C1831z4 f4083y0;

    /* JADX INFO: renamed from: y1 */
    public static final C1831z4 f4084y1;

    /* JADX INFO: renamed from: y2 */
    public static final C1831z4 f4085y2;

    /* JADX INFO: renamed from: y3 */
    public static final C1831z4 f4086y3;

    /* JADX INFO: renamed from: y4 */
    public static final C1831z4 f4087y4;

    /* JADX INFO: renamed from: y5 */
    public static final C1831z4 f4088y5;

    /* JADX INFO: renamed from: y6 */
    public static final C1831z4 f4089y6;

    /* JADX INFO: renamed from: z */
    public static final C1831z4 f4090z;

    /* JADX INFO: renamed from: z0 */
    public static final C1831z4 f4091z0;

    /* JADX INFO: renamed from: z1 */
    public static final C1831z4 f4092z1;

    /* JADX INFO: renamed from: z2 */
    public static final C1831z4 f4093z2;

    /* JADX INFO: renamed from: z3 */
    public static final C1831z4 f4094z3;

    /* JADX INFO: renamed from: z4 */
    public static final C1831z4 f4095z4;

    /* JADX INFO: renamed from: z5 */
    public static final C1831z4 f4096z5;

    /* JADX INFO: renamed from: z6 */
    public static final C1831z4 f4097z6;

    /* JADX INFO: renamed from: a */
    private final String f4098a;

    /* JADX INFO: renamed from: b */
    private final Object f4099b;

    /* JADX INFO: renamed from: c */
    private static final List f3894c = Arrays.asList(Boolean.class, Float.class, Double.class, Integer.class, Long.class, String.class);

    /* JADX INFO: renamed from: d */
    private static final Map f3903d = new HashMap(512);

    static {
        Boolean bool = Boolean.FALSE;
        f3912e = m5748a("is_disabled", bool);
        f3921f = m5748a("device_id", "");
        Boolean bool2 = Boolean.TRUE;
        f3930g = m5748a("rss", bool2);
        f3939h = m5748a("rssoitf", bool);
        f3948i = m5748a("cpoitf", bool);
        f3957j = m5748a("device_token", "");
        f3966k = m5748a("is_verbose_logging", bool);
        f3975l = m5748a("sc", "");
        f3984m = m5748a("sc2", "");
        f3993n = m5748a("sc3", "");
        f4002o = m5748a("server_installed_at", "");
        f4010p = m5748a("clear_completion_callback_on_failure", bool);
        f4018q = m5748a("sicd_ms", 0L);
        f4026r = m5748a("logcat_max_line_size", 1000);
        f4034s = m5748a("exception_handler_enabled", bool2);
        f4042t = m5748a(C11540L6.f25016u, "");
        f4050u = m5748a("lsu", bool);
        f4058v = m5748a("tla_ms", -1L);
        f4066w = m5748a("uactlac", bool);
        f4074x = m5748a("vsk", bool);
        f4082y = m5748a("avt_ms", -1L);
        f4090z = m5748a("avsves", bool);
        f3670A = m5748a("avrctr", "");
        f3678B = m5748a("error_reporter_v1_sample_percent", 100);
        f3686C = m5748a("health_events_reporter_v1_endpoint", "https://sts.applovin.com/v1/stats/sdk");
        f3694D = m5748a("health_events_reporter_v1_event_level_sampling_percentages", "");
        Float fValueOf = Float.valueOf(-1.0f);
        f3702E = m5748a("health_events_reporter_v1_ad_sampling_percent", fValueOf);
        f3710F = m5748a("health_events_reporter_v1_error_sampling_percent", fValueOf);
        f3718G = m5748a("health_events_reporter_v1_user_session_sampling_percent", fValueOf);
        f3726H = m5748a("health_events_reporter_v1_sampling_percent", Float.valueOf(1.0f));
        f3734I = m5748a("health_events_reporter_v1_batch_grouped_events", bool);
        f3742J = m5748a("health_events_reporter_should_skip_al_events_in_max", bool);
        f3750K = m5748a("health_events_reporter_valid_network_status_codes", "");
        f3758L = m5748a("health_events_reporter_include_cached_asset_info", bool);
        f3766M = m5748a("health_events_reporter_include_html_source", bool);
        f3774N = m5748a("stps", 2);
        f3782O = m5748a("auxiliary_operations_threads", 1);
        f3790P = m5748a("apsobt", bool2);
        f3798Q = m5748a("tmtp", 1);
        f3806R = m5748a("network_thread_count", 2);
        f3814S = m5748a("ntp", 5);
        f3822T = m5748a("ueq", bool);
        f3830U = m5748a("coretc", 1);
        f3838V = m5748a("cachetc", 1);
        f3846W = m5748a("mtc", 1);
        f3854X = m5748a("ttc", 1);
        f3862Y = m5748a("otc", 1);
        f3870Z = m5748a("uaeq", bool);
        f3878a0 = m5748a("init_omsdk", bool2);
        f3886b0 = m5748a("omsdk_partner_name", "applovin");
        TimeUnit timeUnit = TimeUnit.SECONDS;
        f3895c0 = m5748a("ttc_max_click_duration_ms", Long.valueOf(timeUnit.toMillis(1L)));
        f3904d0 = m5748a("ttc_max_click_distance_dp", 10);
        AppLovinTouchToClickListener.ClickRecognitionState clickRecognitionState = AppLovinTouchToClickListener.ClickRecognitionState.ACTION_DOWN;
        f3913e0 = m5748a("ttc_acrsv2a", Integer.valueOf(clickRecognitionState.ordinal()));
        f3922f0 = m5748a("ttc_acrsnv", Integer.valueOf(clickRecognitionState.ordinal()));
        f3931g0 = m5748a("ttc_acrsn", Integer.valueOf(clickRecognitionState.ordinal()));
        f3940h0 = m5748a("ttc_edge_buffer_dp", 0);
        f3949i0 = m5748a("whitelisted_postback_endpoints", "https://prod-a.applovin.com,https://rt.applovin.com/4.0/pix, https://rt.applvn.com/4.0/pix,https://ms.applovin.com/,https://ms.applvn.com/");
        f3958j0 = m5748a("fetch_settings_endpoint", "https://ms.applovin.com/");
        f3967k0 = m5748a("fetch_settings_backup_endpoint", "https://ms.applvn.com/");
        f3976l0 = m5748a("adserver_endpoint", "https://a.applovin.com/");
        f3985m0 = m5748a("adserver_backup_endpoint", "https://a.applvn.com/");
        f3994n0 = m5748a("api_endpoint", "https://d.applovin.com/");
        f4003o0 = m5748a("api_backup_endpoint", "https://d.applvn.com/");
        f4011p0 = m5748a("event_tracking_endpoint_v2", "https://rt.applovin.com/");
        f4019q0 = m5748a("event_tracking_backup_endpoint_v2", "https://rt.applvn.com/");
        f4027r0 = m5748a("eete", "https://b.applovin.com/");
        f4035s0 = m5748a("eetbe", "");
        f4043t0 = m5748a("webview_network_error_endpoints_to_report", "applovin.com,applvn.com");
        f4051u0 = m5748a("vle", "");
        f4059v0 = m5748a("vlbe", "");
        f4067w0 = m5748a("vlep", "");
        f4075x0 = m5748a("token_type_prefixes_r", "4!");
        f4083y0 = m5748a("token_type_prefixes_arj", "json_v3!");
        f4091z0 = m5748a("top_level_events", "landing,paused,resumed,cf_start,tos_ok,gdpr_ok,ref,rdf,checkout,iap");
        f3671A0 = m5748a("axon_events", UByte$$ExternalSyntheticBackport0.m43494m((CharSequence) ",", new CharSequence[]{"rewarded_ad_opportunity", "ad_view", "ad_clicked", "page_view", FirebaseAnalytics.Event.VIEW_ITEM, FirebaseAnalytics.Event.ADD_TO_CART, FirebaseAnalytics.Event.BEGIN_CHECKOUT, FirebaseAnalytics.Event.PURCHASE, FirebaseAnalytics.Event.ADD_PAYMENT_INFO, FirebaseAnalytics.Event.REMOVE_FROM_CART, FirebaseAnalytics.Event.VIEW_CART, "wishlist_updated", "refund_requested", "financial_deposit", "financial_withdraw", "financial_transaction", FirebaseAnalytics.Event.LEVEL_START, "level_complete", "level_fail", "virtual_resource_transaction", FirebaseAnalytics.Event.TUTORIAL_COMPLETE, "energy_depleted", "use_prop", "game_shop_enter", FirebaseAnalytics.Event.GENERATE_LEAD, "login", FirebaseAnalytics.Event.SIGN_UP, "search", "product_review", FirebaseAnalytics.Event.APP_OPEN, "account_verification_start", "account_verification_complete", C12434q2.f31749u, "account_linked", "friend_invite", "gift_transaction", "group_joined", "chat_sent", "post_view", "post_created", "subscribe", "start_trial"}));
        f3679B0 = m5748a("max_tracked_axon_events", 20);
        f3687C0 = m5748a("cache_file_ttl_seconds", Long.valueOf(TimeUnit.DAYS.toSeconds(1L)));
        f3695D0 = m5748a("cache_max_size_mb", -1);
        f3703E0 = m5748a("precache_delimiters", ")]', ");
        f3711F0 = m5748a("ad_resource_caching_enabled", bool2);
        f3719G0 = m5748a("resource_cache_prefix", "https://vid.applovin.com/,https://stage-vid.applovin.com/,https://pdn.applovin.com/,https://stage-pdn.applovin.com/,https://img.applovin.com/,https://stage-img.applovin.com/,https://d.applovin.com/,https://assets.applovin.com/,https://stage-assets.applovin.com/,https://cdnjs.cloudflare.com/,http://vid.applovin.com/,http://stage-vid.applovin.com/,http://pdn.applovin.com/,http://stage-pdn.applovin.com/,http://img.applovin.com/,http://stage-img.applovin.com/,http://d.applovin.com/,http://assets.applovin.com/,http://stage-assets.applovin.com/,http://cdnjs.cloudflare.com/,http://u.appl.vn/,https://u.appl.vn/,https://res.applovin.com/,https://res1.applovin.com/,https://res2.applovin.com/,https://res3.applovin.com/,http://res.applovin.com/,http://res1.applovin.com/,http://res2.applovin.com/,http://res3.applovin.com/");
        f3727H0 = m5748a("preserved_cached_assets", "sound_off.png,sound_on.png,closeOptOut.png,1381250003_28x28.png,zepto-1.1.3.min.js,jquery-2.1.1.min.js,jquery-1.9.1.min.js,jquery.knob.js");
        f3735I0 = m5748a("resource_max_filename_length", 255);
        f3743J0 = m5748a("ccrc", bool);
        f3751K0 = m5748a("ustpfcrc", bool);
        f3759L0 = m5748a("mcct", 3);
        f3767M0 = m5748a("mchct", 3);
        f3775N0 = m5748a("dfirf", bool);
        f3783O0 = m5748a("dfipf", bool);
        f3791P0 = m5748a("dcrome", bool);
        f3799Q0 = m5748a("dcrobs", bool);
        f3807R0 = m5748a("pcro", bool);
        f3815S0 = m5748a("serfaad", bool);
        f3823T0 = m5748a("mdafra", 1);
        f3831U0 = m5748a("ssch", bool2);
        f3839V0 = m5748a("suaf", bool);
        f3847W0 = m5748a("lfblrs", bool);
        f3855X0 = m5748a("pawnrrm", bool);
        f3863Y0 = m5748a("rctoa", bool);
        f3871Z0 = m5748a("ape", bool);
        f3879a1 = m5748a("pafqi", bool);
        TimeUnit timeUnit2 = TimeUnit.MINUTES;
        f3887b1 = m5748a("pae_ms", Long.valueOf(timeUnit2.toMillis(5L)));
        f3896c1 = m5748a("pamttl_ms", Long.valueOf(timeUnit.toMillis(5L)));
        f3905d1 = m5748a("saewib", bool);
        f3914e1 = m5748a("fsae_ms", -1L);
        f3923f1 = m5748a("raae", bool);
        f3932g1 = m5748a("vr_retry_count_v1", 1);
        f3941h1 = m5748a("cr_retry_count_v1", 1);
        f3950i1 = m5748a("saru", bool);
        f3959j1 = m5748a("spvtzians", bool);
        f3968k1 = m5748a("close_button_touch_area", 0);
        f3977l1 = m5748a("close_button_outside_touch_area", 0);
        f3986m1 = m5748a("creative_debugger_enabled", bool2);
        f3995n1 = m5748a("smdfhcdb", bool2);
        f4004o1 = m5748a("use_background_view_for_ad_clicks", bool2);
        f4012p1 = m5748a("viewability_adview_imp_delay_ms", Long.valueOf(timeUnit.toMillis(1L)));
        f4020q1 = m5748a("viewability_adview_banner_min_width", Integer.valueOf(Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE));
        f4028r1 = m5748a("viewability_adview_banner_min_height", Integer.valueOf(AppLovinAdSize.BANNER.getHeight()));
        MaxAdFormat maxAdFormat = MaxAdFormat.MREC;
        f4036s1 = m5748a("viewability_adview_mrec_min_width", Integer.valueOf(maxAdFormat.getSize().getWidth()));
        f4044t1 = m5748a("viewability_adview_mrec_min_height", Integer.valueOf(maxAdFormat.getSize().getHeight()));
        f4052u1 = m5748a("viewability_adview_leader_min_width", 728);
        f4060v1 = m5748a("viewability_adview_leader_min_height", Integer.valueOf(AppLovinAdSize.LEADER.getHeight()));
        f4068w1 = m5748a("viewability_adview_native_min_width", 0);
        f4076x1 = m5748a("viewability_adview_native_min_height", 0);
        f4084y1 = m5748a("viewability_adview_min_alpha", Float.valueOf(10.0f));
        f4092z1 = m5748a("viewability_timer_min_visible_ms", Long.valueOf(timeUnit.toMillis(1L)));
        f3672A1 = m5748a("viewability_timer_interval_ms", 100L);
        f3680B1 = m5748a("expandable_close_button_size", 27);
        f3688C1 = m5748a("expandable_h_close_button_margin", 10);
        f3696D1 = m5748a("expandable_t_close_button_margin", 10);
        f3704E1 = m5748a("expandable_lhs_close_button", bool);
        f3712F1 = m5748a("expandable_close_button_touch_area", 0);
        f3720G1 = m5748a("forward_lifecycle_events_to_adview_webview", bool);
        f3728H1 = m5748a("forward_in_app_browser_events_to_adview_webview", bool);
        f3736I1 = m5748a("forward_external_redirect_events_to_adview_webview", bool);
        f3744J1 = m5748a("forward_preload_events_to_adview_webview", bool);
        f3752K1 = m5748a("iaad", bool);
        f3760L1 = m5748a("fullscreen_ad_pending_display_state_timeout_ms", Long.valueOf(timeUnit.toMillis(10L)));
        f3768M1 = m5748a("fullscreen_ad_showing_state_timeout_ms", Long.valueOf(timeUnit2.toMillis(2L)));
        f3776N1 = m5748a("lhs_close_button_video", bool);
        f3784O1 = m5748a("close_button_right_margin_video", 4);
        f3792P1 = m5748a("close_button_size_video", 30);
        f3800Q1 = m5748a("close_button_top_margin_video", 8);
        f3808R1 = m5748a("video_countdown_clock_margin", 10);
        f3816S1 = m5748a("video_countdown_clock_gravity", 83);
        f3824T1 = m5748a("countdown_clock_size", 32);
        f3832U1 = m5748a("countdown_clock_stroke_size", 4);
        f3840V1 = m5748a("countdown_clock_text_size", 28);
        f3848W1 = m5748a("draw_countdown_clock", bool2);
        f3856X1 = m5748a("inter_display_delay", 200L);
        f3864Y1 = m5748a("maximum_close_button_delay_seconds", 999L);
        f3872Z1 = m5748a("respect_close_button", bool2);
        f3880a2 = m5748a("lhs_skip_button", bool2);
        f3888b2 = m5748a("mute_controls_enabled", bool);
        f3897c2 = m5748a("allow_user_muting", bool2);
        f3906d2 = m5748a("mute_videos", bool);
        f3915e2 = m5748a("show_mute_by_default", bool);
        f3924f2 = m5748a("mute_with_user_settings", bool2);
        f3933g2 = m5748a("mute_button_size", 32);
        f3942h2 = m5748a("mute_button_margin", 10);
        f3951i2 = m5748a("mute_button_gravity", 85);
        f3960j2 = m5748a("progress_bar_step", 25L);
        f3969k2 = m5748a("progress_bar_scale", 10000);
        f3978l2 = m5748a("progress_bar_vertical_padding", -8);
        f3987m2 = m5748a("vs_buffer_indicator_size", 50);
        f3996n2 = m5748a("video_zero_length_as_computed", bool);
        f4005o2 = m5748a("set_poststitial_muted_initial_delay_ms", 500L);
        f4013p2 = m5748a("fsahrpg", bool2);
        f4021q2 = m5748a("eaafrwsoa", bool2);
        f4029r2 = m5748a("postitial_progress_bar_step_ms", 25L);
        f4037s2 = m5748a("postitial_progress_bar_on_bottom", bool2);
        f4045t2 = m5748a("postitial_progress_bar_vertical_padding", -8);
        f4053u2 = m5748a("postitial_progress_bar_scale", 10000);
        f4061v2 = m5748a("fahosu", bool);
        f4069w2 = m5748a("system_insets_mask", Integer.valueOf(AbstractC1701q7.m4107g()));
        f4077x2 = m5748a("system_bars_hide_list", "");
        f4085y2 = m5748a("aarwdc", bool);
        f4093z2 = m5748a("track_app_killed", bool);
        f3673A2 = m5748a("track_ad_duration", bool);
        f3681B2 = m5748a("track_ad_duration_interval_ms", Long.valueOf(timeUnit.toMillis(1L)));
        f3689C2 = m5748a("simplified_app_killed_detection", bool);
        f3697D2 = m5748a("app_closed_time_threshold_for_app_killed_event_ms", Long.valueOf(timeUnit.toMillis(60L)));
        f3705E2 = m5748a("track_app_killed_during_mediated_ad", bool);
        f3713F2 = m5748a("track_mediated_ad_duration_interval_ms", -1L);
        f3721G2 = m5748a("app_closed_time_threshold_for_app_killed_during_mediated_ad_event_ms", Long.valueOf(timeUnit.toMillis(60L)));
        f3729H2 = m5748a("nsuttcl", bool);
        f3737I2 = m5748a("submit_postback_timeout", Integer.valueOf((int) timeUnit.toMillis(10L)));
        f3745J2 = m5748a("submit_postback_retries", 4);
        f3753K2 = m5748a("max_postback_attempts", 3);
        f3761L2 = m5748a("max_persisted_postbacks", 100);
        f3769M2 = m5748a("submit_web_tracker_timeout", Integer.valueOf((int) timeUnit.toMillis(7L)));
        f3777N2 = m5748a("sossp", bool);
        f3785O2 = m5748a("spp", bool2);
        f3793P2 = m5748a("fire_native_ad_postbacks_from_webview", bool);
        f3801Q2 = m5748a("use_requests_for_native_ad_click_postbacks", bool);
        f3809R2 = m5748a("preload_postback_webview", bool);
        f3817S2 = m5748a("sejwp", bool);
        f3825T2 = m5748a("ejt_ms", Long.valueOf(timeUnit.toMillis(5L)));
        f3833U2 = m5748a("stahcmi", bool);
        f3841V2 = m5748a("get_retry_delay_v1", Integer.valueOf((int) timeUnit.toMillis(10L)));
        f3849W2 = m5748a("http_connection_timeout", Integer.valueOf((int) timeUnit.toMillis(30L)));
        f3857X2 = m5748a("http_socket_timeout", Integer.valueOf((int) timeUnit.toMillis(20L)));
        f3865Y2 = m5748a("fetch_ad_connection_timeout", Integer.valueOf((int) timeUnit.toMillis(30L)));
        f3873Z2 = m5748a("fetch_ad_retry_count_v1", 1);
        f3881a3 = m5748a("faer", bool);
        f3889b3 = m5748a("faroae", bool);
        f3898c3 = m5748a("submit_data_retry_count_v1", 1);
        f3907d3 = m5748a("response_buffer_size", 16000);
        f3916e3 = m5748a("fetch_basic_settings_connection_timeout_ms", Integer.valueOf((int) timeUnit.toMillis(10L)));
        f3925f3 = m5748a("fetch_basic_settings_retry_count", 3);
        f3934g3 = m5748a("fetch_basic_settings_on_reconnect", bool);
        f3943h3 = m5748a("skip_fetch_basic_settings_if_not_connected", bool);
        f3952i3 = m5748a("fetch_basic_settings_retry_delay_ms", Integer.valueOf((int) timeUnit.toMillis(2L)));
        f3961j3 = m5748a("idflrwbe", bool);
        f3970k3 = m5748a("falawpr", bool);
        f3979l3 = m5748a("sort_query_parameters", bool);
        f3988m3 = m5748a("communicator_request_timeout_ms", Long.valueOf(timeUnit.toMillis(10L)));
        f3997n3 = m5748a("communicator_request_retry_count", 3);
        f4006o3 = m5748a("communicator_request_retry_delay_ms", Long.valueOf(timeUnit.toMillis(2L)));
        f4014p3 = m5748a("rfbsd_ms", -1L);
        f4022q3 = m5748a("ehkpd_ms", 500L);
        f4030r3 = m5748a("rironc", bool);
        f4038s3 = m5748a("rroncbd", bool);
        f4046t3 = m5748a("wverc_ms", Long.valueOf(timeUnit.toMillis(5L)));
        f4054u3 = m5748a("scrsifm", bool);
        f4062v3 = m5748a("suohfrl", bool);
        f4070w3 = m5748a("lvrc", 1);
        f4078x3 = m5748a("spbuuws", bool);
        f4086y3 = m5748a("session_tracking_cooldown_on_event_fire", bool2);
        f4094z3 = m5748a("session_tracking_resumed_cooldown_minutes", 90L);
        f3674A3 = m5748a("session_tracking_paused_cooldown_minutes", 90L);
        f3682B3 = m5748a("qq", bool);
        f3690C3 = m5748a("qq1", bool2);
        f3698D3 = m5748a("qq2", bool);
        f3706E3 = m5748a("qq3", bool2);
        f3714F3 = m5748a("qq4", bool2);
        f3722G3 = m5748a("qq5", bool2);
        f3730H3 = m5748a("qq6", bool2);
        f3738I3 = m5748a("qq7", bool2);
        f3746J3 = m5748a("qq8", bool2);
        f3754K3 = m5748a("qq9", bool);
        f3762L3 = m5748a("qq10", bool2);
        f3770M3 = m5748a("qq11", bool2);
        f3778N3 = m5748a("qq12", bool2);
        f3786O3 = m5748a("pui", bool2);
        f3794P3 = m5748a("plugin_version", "");
        f3802Q3 = m5748a("validate_admob_adapter_sdk_version", bool2);
        f3810R3 = m5748a("ccbtbsic", bool);
        f3818S3 = m5748a("hgn", bool2);
        f3826T3 = m5748a("cso", bool2);
        f3834U3 = m5748a("cfs", bool2);
        f3842V3 = m5748a("cmi", bool2);
        f3850W3 = m5748a("crat", bool2);
        f3858X3 = m5748a("cvs", bool2);
        f3866Y3 = m5748a("caf", bool2);
        f3874Z3 = m5748a("cf", bool2);
        f3882a4 = m5748a("cmtl", bool2);
        f3890b4 = m5748a("cnr", bool2);
        f3899c4 = m5748a("ccr", bool);
        f3908d4 = m5748a("adr", bool2);
        f3917e4 = m5748a("volume_normalization_factor", Float.valueOf(100.0f));
        f3926f4 = m5748a("system_user_agent_collection_enabled", bool);
        f3935g4 = m5748a("user_agent_collection_enabled", bool);
        f3944h4 = m5748a("use_cached_user_agent_as_default", bool2);
        f3953i4 = m5748a("collect_device_angle", bool2);
        f3962j4 = m5748a("collect_device_movement", bool2);
        f3971k4 = m5748a("movement_degradation", Float.valueOf(0.75f));
        f3980l4 = m5748a("device_sensor_period_ms", Integer.valueOf(ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION));
        f3989m4 = m5748a("mps", "");
        f3998n4 = m5748a("mpsl", 3);
        f4007o4 = m5748a(C12551uc.f32569c, "com.applovin,dalvik,java,android,com.android");
        f4015p4 = m5748a("cmps", bool);
        f4023q4 = m5748a("rmps", bool);
        f4031r4 = m5748a("collect_webview_package_info", bool);
        f4039s4 = m5748a("webview_package_names", "com.google.android.webview,com.android.webview");
        f4047t4 = m5748a("collect_opengl_version", bool);
        f4055u4 = m5748a("ncre", bool);
        f4063v4 = m5748a("ncrs", "4,5,6,7,8,11,16");
        f4071w4 = m5748a("ncrcs", bool);
        f4079x4 = m5748a("ncrcai", bool2);
        f4087y4 = m5748a("tmas", "");
        f4095z4 = m5748a("tmasl", "");
        f3675A4 = m5748a("tmahl", 1);
        f3683B4 = m5748a("suia", bool2);
        f3691C4 = m5748a("asicl", 1);
        f3699D4 = m5748a("aeicl", 1);
        f3707E4 = m5748a("aeisupf", bool);
        f3715F4 = m5748a("aeistl", -1);
        f3723G4 = m5748a("aeistsr", CampaignEx.CLICKMODE_ON);
        f3731H4 = m5748a("csbi", bool);
        f3739I4 = m5748a("btt_ms", Long.valueOf(timeUnit.toMillis(20L)));
        f3747J4 = m5748a("chs", bool);
        f3755K4 = m5748a("dltc", "");
        f3763L4 = m5748a("sy_stc", JsonUtils.EMPTY_JSON);
        f3771M4 = m5748a("se_stc", JsonUtils.EMPTY_JSON);
        f3779N4 = m5748a("gl_stc", JsonUtils.EMPTY_JSON);
        f3787O4 = m5748a("crpaf", bool);
        f3795P4 = m5748a("umsm", bool);
        f3803Q4 = m5748a("vast_image_html", "<html><head><style>html,body{height:100%;width:100%}body{background-image:url({SOURCE});background-repeat:no-repeat;background-size:contain;background-position:center;}a{position:absolute;top:0;bottom:0;left:0;right:0}</style></head><body><a href=\"applovin://com.applovin.sdk/adservice/track_click_now\"></a></body></html>");
        f3811R4 = m5748a("vast_link_html", "<html><head><style>html,body,iframe{height:100%;width:100%;}body{margin:0}iframe{border:0;overflow:hidden;position:absolute}</style></head><body><iframe src={SOURCE} frameborder=0></iframe></body></html>");
        f3819S4 = m5748a("vast_max_response_length", 640000);
        f3827T4 = m5748a("vast_max_wrapper_depth", 5);
        f3835U4 = m5748a("vast_unsupported_video_extensions", "ogv,flv");
        f3843V4 = m5748a("vast_unsupported_video_types", "video/ogg,video/x-flv");
        f3851W4 = m5748a("vast_validate_with_extension_if_no_video_type", bool2);
        f3859X4 = m5748a("vast_wrapper_resolution_retry_count_v1", 1);
        f3867Y4 = m5748a("vast_wrapper_resolution_connection_timeout", Integer.valueOf((int) timeUnit.toMillis(30L)));
        f3875Z4 = m5748a("vast_industry_icon_max_size", 20);
        f3883a5 = m5748a("vast_industry_icon_margin", 12);
        f3891b5 = m5748a("vast_industry_icon_gravity", 85);
        f3900c5 = m5748a("vast_native_mute_button_size", 24);
        f3909d5 = m5748a("vast_native_play_pause_button_size", 24);
        f3918e5 = m5748a("vast_native_video_widget_padding", 6);
        f3927f5 = m5748a("vast_native_video_widget_alpha", Float.valueOf(0.5f));
        f3936g5 = m5748a("vast_native_video_widgets_enabled", bool2);
        f3945h5 = m5748a("vast_replay_video_upon_completion", bool2);
        f3954i5 = m5748a("vast_replay_icon_size", 64);
        f3963j5 = m5748a("vcjfhr", bool);
        f3972k5 = m5748a("vcjfhrr", "(?:<|%3C)script[^>]*src=\"(https[^\"]*\\.js[^\"]*)\".*?(?:>|%3E)");
        f3981l5 = m5748a("vpenfxr", "(<Error><!\\[CDATA\\[[^>]*><\\/Error>)");
        f3990m5 = m5748a("vast_fire_trackers_from_webview", bool);
        f3999n5 = m5748a("ree", bool2);
        AbstractC1804w4.a aVar = AbstractC1804w4.a.DEFAULT;
        f4008o5 = m5748a("ree_t", Integer.valueOf(aVar.m5548b()));
        f4016p5 = m5748a("btee", bool2);
        f4024q5 = m5748a("btet", Integer.valueOf(aVar.m5548b()));
        f4032r5 = m5748a("reetoa", bool);
        f4040s5 = m5748a("reet_msfs", Integer.valueOf(aVar.m5548b()));
        AbstractC1804w4.a aVar2 = AbstractC1804w4.a.V2;
        f4048t5 = m5748a("reet_msma", Integer.valueOf(aVar2.m5548b()));
        f4056u5 = m5748a("reet_msmd", Integer.valueOf(aVar.m5548b()));
        f4064v5 = m5748a("reet_asfp", Integer.valueOf(aVar.m5548b()));
        f4072w5 = m5748a("reet_asfg", Integer.valueOf(aVar.m5548b()));
        f4080x5 = m5748a("reet_aset", Integer.valueOf(aVar.m5548b()));
        f4088y5 = m5748a("reet_asaet", Integer.valueOf(aVar2.m5548b()));
        f4096z5 = m5748a("reet_esdi", Integer.valueOf(aVar.m5548b()));
        f3676A5 = m5748a("reet_esrp", Integer.valueOf(aVar.m5548b()));
        f3684B5 = m5748a("reet_lv", Integer.valueOf(aVar2.m5548b()));
        f3692C5 = m5748a("apdra", bool);
        f3700D5 = m5748a("apdrfs", bool);
        f3708E5 = m5748a("apdrma", bool);
        f3716F5 = m5748a("apdrmd", bool);
        f3724G5 = m5748a("apdrfa", bool);
        f3732H5 = m5748a("apdrev", bool);
        f3740I5 = m5748a("apdrdi", bool);
        f3748J5 = m5748a("apdrrp", bool);
        f3756K5 = m5748a("server_timestamp_ms", 0L);
        f3764L5 = m5748a("device_timestamp_ms", 0L);
        f3772M5 = m5748a("stpfef", bool);
        f3780N5 = m5748a("gzip_min_length", 0);
        f3788O5 = m5748a("gzip_encoding_default", bool);
        f3796P5 = m5748a("fetch_settings_gzip", bool);
        f3804Q5 = m5748a("device_init_gzip", bool);
        f3812R5 = m5748a("fetch_ad_gzip", bool);
        f3820S5 = m5748a("event_tracking_gzip", bool);
        f3828T5 = m5748a("reward_postback_gzip", bool);
        f3836U5 = m5748a("avg", bool);
        f3844V5 = m5748a("handle_render_process_gone", bool2);
        f3852W5 = m5748a("rworpg", bool2);
        f3860X5 = m5748a("fdadaomr", bool2);
        f3868Y5 = m5748a("vfswccar", bool);
        f3876Z5 = m5748a("sparafad", bool);
        f3884a6 = m5748a("fahctdmr", bool);
        f3892b6 = m5748a("mmcarc", bool);
        f3901c6 = m5748a("teorpc", bool);
        f3910d6 = m5748a("set_webview_render_process_client", bool);
        f3919e6 = m5748a("disable_webview_hardware_acceleration", bool);
        f3928f6 = m5748a("anr_detection_enabled", bool);
        f3937g6 = m5748a("anr_trigger_millis", 4000L);
        f3946h6 = m5748a("anr_touch_millis", 3000L);
        f3955i6 = m5748a("anr_check_millis", 3000L);
        f3964j6 = m5748a("spadib", bool);
        f3973k6 = m5748a("uobid", bool2);
        f3982l6 = m5748a("bvde", bool);
        f3991m6 = m5748a("bvdidm", 1000L);
        f4000n6 = m5748a("bvdim", 4000L);
        f4009o6 = m5748a("bvdrs", 10);
        f4017p6 = m5748a("bvdct", 230);
        f4025q6 = m5748a("bvdict", 3);
        f4033r6 = m5748a("bvad", bool);
        f4041s6 = m5748a("bvebb", bool2);
        f4049t6 = m5748a("bvscb", bool2);
        f4057u6 = m5748a("bvlmtb", -1L);
        f4065v6 = m5748a("bvsafw", bool2);
        f4073w6 = m5748a("bvdtr", 2);
        f4081x6 = m5748a("bvdtc", 2);
        f4089y6 = m5748a("stcpc", bool);
        f4097z6 = m5748a("stcic", bool2);
        f3677A6 = m5748a("qjscwwvl", bool);
        f3685B6 = m5748a("web_contents_debugging_enabled", bool);
        f3693C6 = m5748a("fcioiauiidb", bool2);
        f3701D6 = m5748a("teouauiidb", bool2);
        f3709E6 = m5748a("usc", bool);
        f3717F6 = m5748a("should_apply_web_view_settings_to_web_view_button", bool);
        f3725G6 = m5748a("should_use_cached_screen_size_for_foldable_devices", bool2);
        f3733H6 = m5748a("should_persist_shared_prefs_with_background_commit", bool);
        f3741I6 = m5748a("wvmldt", -1);
        f3749J6 = m5748a("fmldt", -1);
        f3757K6 = m5748a("csl", -1);
        f3765L6 = m5748a("should_use_applovin_adaptive_sizing_formula", bool);
        f3773M6 = m5748a("cdbpn", bool);
        f3781N6 = m5748a("cavdi", bool);
        f3789O6 = m5748a("pvdiaqp", bool);
        f3797P6 = m5748a("sudbia", bool);
        f3805Q6 = m5748a("pbpn", "");
        f3813R6 = m5748a("nvelifapd", bool);
        f3821S6 = m5748a("ignored_auto_redirect_schemes", UByte$$ExternalSyntheticBackport0.m43494m((CharSequence) ",", new CharSequence[]{"about", "data", C11744X3.i.f26356b}));
        f3829T6 = m5748a("esowod", bool);
        f3837U6 = m5748a("sswskan", bool);
        f3845V6 = m5748a("rfipt", bool);
        f3853W6 = m5748a("fraseon", bool);
        f3861X6 = m5748a("config_consent_dialog_state", "unknown");
        f3869Y6 = m5748a("country_code", "");
        f3877Z6 = m5748a("approved_installers_for_package_name_override", "com.google.android.packageinstaller");
        f3885a7 = m5748a("consent_flow_doc_url", "https://support.axon.ai/en/max/android/overview/terms-and-privacy-policy-flow");
        f3893b7 = m5748a("consent_flow_unity_doc_url", "https://support.axon.ai/en/max/unity/overview/terms-and-privacy-policy-flow");
        f3902c7 = m5748a("cfadtml", 20);
        f3911d7 = m5748a("cfgcsmrc", -1);
        f3920e7 = m5748a("cfgcsrec", String.valueOf(3));
        f3929f7 = m5748a("enable_custom_tabs_service", bool2);
        f3938g7 = m5748a("custom_tabs_chrome_package_names", "com.android.chrome");
        f3947h7 = m5748a("custom_tabs_prefer_default_browser", bool2);
        f3956i7 = m5748a("custom_tabs_animation_enabled", bool2);
        f3965j7 = m5748a("custom_tabs_open_external_browser_on_failure", bool2);
        f3974k7 = m5748a("gawvbu", "https://applovin.com");
        f3983l7 = m5748a("c_sticky_topics", "safedk_init,user_info");
        f3992m7 = m5748a("communicator_enabled", bool2);
        f4001n7 = m5748a("adse", bool2);
    }

    public C1831z4(String str, Object obj) {
        if (str == null) {
            throw new IllegalArgumentException("No name specified");
        }
        if (obj == null) {
            throw new IllegalArgumentException("No default value specified");
        }
        this.f4098a = str;
        this.f4099b = obj;
    }

    /* JADX INFO: renamed from: a */
    public static C1831z4 m5747a(String str) {
        return (C1831z4) f3903d.get(str);
    }

    /* JADX INFO: renamed from: a */
    protected static C1831z4 m5748a(String str, Object obj) {
        if (obj == null) {
            throw new IllegalArgumentException("No default value specified");
        }
        if (!f3894c.contains(obj.getClass())) {
            throw new IllegalArgumentException("Unsupported value type: " + obj.getClass());
        }
        C1831z4 c1831z4 = new C1831z4(str, obj);
        Map map = f3903d;
        if (!map.containsKey(str)) {
            map.put(str, c1831z4);
            return c1831z4;
        }
        throw new IllegalArgumentException("Setting has already been used: " + str);
    }

    /* JADX INFO: renamed from: c */
    public static Collection m5749c() {
        return Collections.synchronizedCollection(f3903d.values());
    }

    /* JADX INFO: renamed from: a */
    public Object m5750a() {
        return this.f4099b;
    }

    /* JADX INFO: renamed from: a */
    public Object m5751a(Object obj) {
        return this.f4099b.getClass().cast(obj);
    }

    /* JADX INFO: renamed from: b */
    public String m5752b() {
        return this.f4098a;
    }

    @Override // java.lang.Comparable
    public int compareTo(Object obj) {
        if (!(obj instanceof C1831z4)) {
            return 0;
        }
        return this.f4098a.compareTo(((C1831z4) obj).m5752b());
    }
}
