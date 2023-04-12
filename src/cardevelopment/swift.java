package cardevelopment;

public class swift extends Car {
@Override
public void start() {
	System.out.println("key start");
}
@Override
public void accelerate() {
	System.out.println("half clutch drive");
}
@Override
public void stop() {
	System.out.println("key stop");
}
@Override
public void bluetooth() {
	System.out.println("bluetooth for swift car installed");
}
}
