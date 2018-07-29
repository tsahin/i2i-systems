//
//  ViewController.swift
//  calculator
//
//  Created by Tuğba Şahin on 23.07.2018.
//

import UIKit

class ViewController: UIViewController {
     var result = 0
    @IBOutlet weak var secondnumber: UITextField!
    @IBOutlet weak var firstnumber: UITextField!
    @IBOutlet weak var lbl: UILabel!
    @IBAction func btnbol(_ sender: Any) {
        result = Int(firstnumber.text!)! / Int(secondnumber.text!)!
            lbl.text = String(result)
    }
    @IBAction func btncarp(_ sender: Any) {
            result = Int(firstnumber.text!)! * Int(secondnumber.text!)!
            lbl.text = String(result)
    }
    @IBAction func btncikar(_ sender: Any) {
            result = Int(firstnumber.text!)! - Int(secondnumber.text!)!
            lbl.text = String(result)
        
    }
    @IBAction func btntopla(_ sender: Any) {
            result = Int(firstnumber.text!)! + Int(secondnumber.text!)!
            lbl.text = String(result)
    }
    
    override func viewDidLoad() {
        super.viewDidLoad()
        // Do any additional setup after loading the view, typically from a nib.
    }

    override func didReceiveMemoryWarning() {
        super.didReceiveMemoryWarning()
        // Dispose of any resources that can be recreated.
    }


}

