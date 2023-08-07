package gptconnector.model;

public enum Scheduler {
    DDPMScheduler
    , DDIMScheduler
    , PNDMScheduler
    , LMSDiscreteScheduler
    , EulerDiscreteScheduler
    , EulerAncestralDiscreteScheduler
    , DPMSolverMultistepScheduler
    , HeunDiscreteScheduler
    , KDPM2DiscreteScheduler
    , DPMSolverSinglestepScheduler
    , KDPM2AncestralDiscreteScheduler
    , UniPCMultistepScheduler
    , DDIMInverseScheduler
    , DEISMultistepScheduler
    , IPNDMScheduler
    , KarrasVeScheduler
    , ScoreSdeVeScheduler
}
