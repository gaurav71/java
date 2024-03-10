package introtooops.constructors;

public class Phone {
    private int modelNo;
    private String modelName;
    private int processorVersion;
    private String processorName;
    private int screenSize;
    private int batteryCapacity;
    private int cameraSpecs;
    private int price;

    // The compiler automatically provides a no-argument, default constructor for any class without introtooops.constructors
    // when an object is created, all the attributes will have the default value unless overwritten in the constructor
    // The default constructor will not be created for the class if there is even a single explicit constructor

    // parameteried constructor
    public Phone(int modelNo, String modelName, int processorVersion, String processorName, int screenSize, int batteryCapacity, int cameraSpecs, int price) {
        this.modelNo = modelNo;
        this.modelName = modelName;
        this.processorVersion = processorVersion;
        this.processorName = processorName;
        this.screenSize = screenSize;
        this.batteryCapacity = batteryCapacity;
        this.cameraSpecs = cameraSpecs;
        this.price = price;
    }

    // copy constructor
    public Phone(Phone phone) {
        this.modelNo = phone.modelNo + 1;
        this.modelName = phone.modelName;
        this.processorVersion = phone.processorVersion + 1;
        this.processorName = phone.processorName;
        this.screenSize = phone.screenSize;
        this.batteryCapacity = phone.batteryCapacity;
        this.cameraSpecs = phone.cameraSpecs;
        this.price = phone.price + 10000;
    }

    public int getModelNo() {
        return modelNo;
    }

    public void setModelNo(int modelNo) {
        this.modelNo = modelNo;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public int getProcessorVersion() {
        return processorVersion;
    }

    public void setProcessorVersion(int processorVersion) {
        this.processorVersion = processorVersion;
    }

    public String getProcessorName() {
        return processorName;
    }

    public void setProcessorName(String processorName) {
        this.processorName = processorName;
    }

    public int getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(int screenSize) {
        this.screenSize = screenSize;
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public int getCameraSpecs() {
        return cameraSpecs;
    }

    public void setCameraSpecs(int cameraSpecs) {
        this.cameraSpecs = cameraSpecs;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
