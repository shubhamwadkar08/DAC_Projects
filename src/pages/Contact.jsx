import React from 'react';
import '../pages/Contact.css';
import Base from '../components/Base';
function ContactUs() {
  return (
    <Base>
    <section className="contact-us">
      <div className="contact-info">
        <h2>Contact Us</h2>
        <p>Have any questions or comments? We'd love to hear from you!</p>
        <p><b>Phone: </b><a href="tel:+917788994455">+91 7798169745</a></p>
        <p><b>Email: </b><a href="mailto:blogmintont@gmail.com">blogminton@gmail.com</a></p>
        <p><b>Address: </b> CDAC ACTS, panchawati, Pashan, 4110034</p>
      </div>
      
    </section>
    </Base>
  );
}

export default ContactUs;