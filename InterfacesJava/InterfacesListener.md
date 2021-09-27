## Interfaces listener y sus metodos. JAVA

**Interface**: *Action listener*: La interfaz de escucha para recibir elementos de accion.

**Metodo**: *actionPerformed* (ActionEvent)



**Interface**: *AdjustmentListener* : La interfaz de escucha para recibir eventos de ajuste.

**Metodo**: *adjustmentValueChanged* (AdjustmentValueChanged)



**Interface**: *ComponentListener* : La interfaz de escucha para recibir eventos de commponentes

**Metodo**          
---------------------------------------|
*componentHidden* (ComponentEvent)     |
*componentMoved* (ComponentEvent)      |
*componentResized* (ComponentEvent)    |
*componentShown* (ComponentEvent)      |



**Interface**: *ContainerListener* : La interfaz de escucha para recibir eventos de contenedores

**Metodo**
---------------------------------------|
*ComponentAdded* (ComponentEvent)      |
*ComponentRemoved* (ComponentEvent)    | 



**Interface**: *FocusListener* : La interfaz de escucha para recibir eventos de teclado se centran en un componente

**Metodo**
---------------------------------------|
*focusGained* (FocusEvent)             |
*focusLost* (FocusEvent)               | 



**Interface**: *ItemListener* :  La interfaz de escucha para recibir eventos de elemento

**Metodo**: *itemStateChanged* (ItemEvent)



**Interface**: *KeyListener* : La interfaz de escucha para recibir eventos de teclado (combinaciones de teclas).

**Metodo**:
---------------------------------------|
*keyPressed* (KeyEvent)                |
*keyTyped* (KeyEvent)                  |  