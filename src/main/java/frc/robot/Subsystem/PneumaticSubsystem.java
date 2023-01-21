package frc.robot.Subsystem;


import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;


import edu.wpi.first.wpilibj.PneumaticsModuleType;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;


public class PneumaticSubsystem extends SubsystemBase{
   private final Solenoid m_solenoid;


   public PneumaticSubsystem(){
       m_solenoid = new Solenoid(PneumaticsModuleType.CTREPCM, 3);
   }
   public void extendPiston() {
       //m_solenoid.toggle();
       m_solenoid.set(true);
   }
   public void RetractPiston() {
       //m_solenoid.toggle();
       m_solenoid.set(false);
   }
}


