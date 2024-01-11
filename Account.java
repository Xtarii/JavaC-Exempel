/**
 * Account Object
 */
class Account{
    static{
        // Loads Library Files
        System.loadLibrary("DLL/backend");
    }
    
    
    
    /**
     * Stores Account Details
     * <blockquote><pre>
     * name: Account Name
     * age: Account Age
     * id : Account ID
     * </pre></blockquote>
     * 
     * Account Details will be stored to {@code JSON} file.
     * With name {@code Account.json} if file exists content
     * will be over else new file will be created
     */
    public native void store();
    /**
     * Stores Account Details
     * <blockquote><pre>
     * name: Account Name
     * age: Account Age
     * id : Account ID
     * </pre></blockquote>
     * 
     * Account Details will be stored to {@code JSON} file.
     * With name {@code Account.json} if file exists content
     * will be over else new file will be created
     * 
     * 
     * 
     * @param path File Location Path
     */
    public native void store(String path);
}