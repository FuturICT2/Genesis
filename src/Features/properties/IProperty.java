/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Features.properties;

import Features.IFeature;

/**
 *
 * @author mcb
 */
public interface IProperty<O extends Object> extends IFeature{
    O getProperty();
    void setProperty(O property);
    EPropertyCategory getCategory();   
}
